package serveur;
import java.io.Serializable;
import java.rmi.RemoteException;


public class ConversionImpl implements IConversion, Serializable {

	 @Override
	    public double convertirMontant(double mt) throws RemoteException {
		//exemple: convertion d'un montant en euros en dollars
		 double tauxDeChange = 1.15; // Taux de change euro-dollar
	        return mt * tauxDeChange;
	 }
}
