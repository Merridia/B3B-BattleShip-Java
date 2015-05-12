/**
  * @author Jennifer & Romain
 */
package battleship.serveur;

import java.net.ServerSocket;
import java.net.Socket;

//import java.util.LinkedList;

/** import from the project */
import battleship.client.Users;

/** Objectifs of the class */
public class Serveur {
	/** Membres */
	private ServerSocket ss;
	
	/** Constructeur */
	public Serveur() 
	{
		try {
			ss = new ServerSocket(1234);
			System.out.println("Server is listening...");
			
			while(true) 
			{
				// un client se connecte
				Socket socket = ss.accept();
				System.out.println("A client is connect !");
				ThreadServeur ts=new ThreadServeur(socket);
				System.out.println("Thread serveur instancié");
				new Thread(ts).start();
				
			}

		} catch (Exception e) {
			System.err.println("Serveur : "+e.getMessage());
		}
	}
	
	public void close() throws Exception
	{
		ss.close();
	}
	
	/** Methodes */
	//TODO Ajouter la liste des clients et des threads créer ici:
	public void savePlayerIn(Users thePlayer, Socket ss){
		thePlayer.setConnection(ss.toString());
		//playerList
	}
	
	//Main d'essai:
	public static void main(String[] args) {
		new Serveur();
	}
	/** Getter & Setter */
	
}
