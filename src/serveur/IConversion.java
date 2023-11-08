package serveur;

import java.rmi.*;


public interface IConversion extends Remote{

	double convertirMontant(double mt)throws RemoteException;

}
