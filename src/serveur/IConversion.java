package serveur;

import java.rmi.*;


public interface IConversion extends Remote{

	public double convertirMontant(double mt)throws RemoteException;

}
