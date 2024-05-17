import java.util.Scanner;

public class GestoreStalla {
	String[] stalla = new String[5];
	Scanner input = new Scanner(System.in);

	void aggiungiAnimali() {
		boolean flag=true;


		for(int i=0; i<stalla.length; i++) {
			if(stalla[i] == null){
				System.out.println("Inserisci ID: ");
				int id = Integer.parseInt(input.nextLine());
				System.out.println("Tipo animale: ");
				String tipoAnimale = input.nextLine();
				System.out.println("Provenienza: ");
				String provenienza = input.nextLine();
				System.out.println("Tipo alimentazione: ");
				String tipoAlimentazione = input.nextLine();
				System.out.println("Valore: ");
				Double valore = Double.parseDouble(input.nextLine());
				String animale = id+";"+tipoAnimale+";"+provenienza+";"+tipoAlimentazione+";"+valore;
				stalla[i] = animale;
				flag=false;
				break;
			}

		}



		if(flag) {
			System.out.println("Stalla satura! Non è possibile aggiungere animali");
		}

	}



	void leggiAnimale(int id) {
		for(int i=0; i<stalla.length; i++) {
			String[] campi = stalla[i].split(";");
			int idCorrente = Integer.parseInt(campi[0]);
			if(id == idCorrente) {
				System.out.println("**SCHEDA ANIMALE**");
				System.out.println("ID: "+ campi[0]);
				System.out.println("Tipo di animale: "+campi[1]);
				System.out.println("Provenienza: "+campi[2]);
				System.out.println("Alimentazione: "+campi[3]);
				System.out.println("Valore: "+campi[4]);
				System.out.println("*******");
				break;

			}
			else {
				System.out.println("ID non esistente");

			}
		}
	}

	void leggiAnimali() {
		for(int i=0; i<stalla.length; i++) {
			if(stalla[i]!=null) {

				String[] campi = stalla[i].split(";");

				System.out.println("**SCHEDA ANIMALE**");
				System.out.println("ID: "+ campi[0]);
				System.out.println("Tipo di animale: "+campi[1]);
				System.out.println("Provenienza: "+campi[2]);
				System.out.println("Alimentazione: "+campi[3]);
				System.out.println("Valore: "+campi[4]);
				System.out.println("*******");
			}
		}
	}

	void rimuoviAnimale(int idScelto) {
		boolean trovato = false;
		for (int i = 0; i < stalla.length; i++) {
			if (stalla[i] != null) {
				String[] campi = stalla[i].split(";");
				int idCorrente = Integer.parseInt(campi[0]);
				if (idCorrente == idScelto) {
					stalla[i] = null;
					trovato = true;
					System.out.println("Animale rimosso dalla cella " + i);	                	                
					break;
				}
			}
		}
		if (!trovato) {
			System.out.println("Animale con ID " + idScelto + " non trovato.");
		}








	}


}
