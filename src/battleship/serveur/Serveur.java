/**
  * @author Jennifer
 */
package battleship.serveur;

import java.net.ServerSocket;
import java.net.Socket;

/** import from the project */
import battleship.client.Users;

/** Objectifs of the class */
public class Serveur {
	/** Membres */
	public PlayersIn playerList;
	private ServerSocket ss;
	
	/** Constructeur */
	public Serveur() {
		
		try {
			ss = new ServerSocket(1234);
			System.out.println("Server is listening...");
			
			while(true) {
				// un client se connecte
				Socket socket = ss.accept();
				System.out.println("A client is connect !");
				
				new Thread(new ThreadServeur(socket)).start();
				
			}

		} catch (Exception e) {
			System.err.println("Serveur : "+e.getMessage());
		}
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
