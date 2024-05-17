import java.util.Scanner;

public class Avvio {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("********MENU********");
		System.out.println("1 - Aggiungi animale ");
		System.out.println("2 - Visualizza singolo animale ");
		System.out.println("3 - Visualizza animali ");
		System.out.println("4 - Rimuovi animale ");
		System.out.println("5 - Esci.");
		System.out.println("********************");
		
		GestoreStalla stalla = new GestoreStalla();
		Scanner input = new Scanner(System.in);
		int scelta = 1;
		
		do {
			
			System.out.println("Scegli opzione: ");
			scelta=Integer.parseInt(input.nextLine());
			
			switch(scelta) {
			
			case 1:
				stalla.aggiungiAnimali();
				System.out.println("Premi un tasto per continuare: ");
				input.nextLine();
				break;
				
			case 2:
				System.out.println("Inserisci ID animale da visualizzare: ");
				int id = Integer.parseInt(input.nextLine());
				stalla.leggiAnimale(id);
				System.out.println("Premi un tasto per continuare: ");
				input.nextLine();
				break;
			
			case 3:
				System.out.println("Grazie e arrivederci!");
				break;
				
			}
			
		}
		while(scelta != 3);

	

	}

}
