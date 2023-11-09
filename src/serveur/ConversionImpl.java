package serveur;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ConversionImpl  extends UnicastRemoteObject implements IConversion {


	public ConversionImpl() throws RemoteException {
	    }

	 @Override
	    public double convertirMontant(double mt) throws RemoteException {
		//exemple: convertion d'un montant en euros en dollars
		 double tauxDeChange = 3.15; // Taux de change euro-dollar
	        return mt * tauxDeChange;
	 }
}
