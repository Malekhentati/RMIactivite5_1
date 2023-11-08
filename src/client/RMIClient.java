package client;

import java.rmi.Naming;

import serveur.IConversion;

public class RMIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			IConversion stub=(IConversion)Naming.lookup("rmi://localhost:1099/ConversionObject");
			
			 double montant1 = 700.00;
			 double resultat1 = stub.convertirMontant(montant1);
	         System.out.println("Conversion de " + montant1 + " euros en dollars : " + resultat1);
			 
	         double montant2 = 80.00;
	         double resultat2 = stub.convertirMontant(montant2);
	         System.out.println("Conversion de " + montant2 + " euros en dollars : " + resultat2);
			 
		}catch (Exception e) {
            System.err.println("Erreur du serveur : " + e.getMessage());
            e.printStackTrace();
        }
	}

}
