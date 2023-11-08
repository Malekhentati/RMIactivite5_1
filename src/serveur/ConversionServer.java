package serveur;

import java.rmi.Naming;
import java.rmi.registry.*;

public class ConversionServer {
  public static void main(String[] args) {
        try {
            // Créez ou obtenez un registre RMI (port 1099 par défaut)
            LocateRegistry.createRegistry(1099);

            // Créez une instance de l'objet distant (ConversionImpl)
            IConversion od = new ConversionImpl();

            System.out.println(od.toString());
            Naming.rebind("rmi://localhost:1099/ConversionObject", od);

            System.out.println("Serveur RMI de conversion démarré.");
        } 
        catch (Exception e) { System.err.println("Erreur du serveur : " + e.getMessage());
            e.printStackTrace();}
           
        }}
    
	



	

	
  