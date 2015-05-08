package battleship.serveur;

import java.net.ServerSocket;
import java.net.Socket;

public class Serveur 
{
	public Serveur() 
	{
		try 
		{
			// écoute du serveur
			ServerSocket ss=new ServerSocket(1234);
			System.out.println("Serveur en écoute...");
			while(true) 
			{
				// un client se connecte
				Socket socket=ss.accept();
				System.out.println("Un client est connecté !");
				new Thread(new ThreadServeur(socket)).start();
			}
		} 
		catch (Exception e) 
		{
			System.err.println("Serveur : "+e.getMessage());
		}
	}
	
	public static void main(String[] args) 
	{
		new Serveur();
	}

}

