/**
  * @author Jennifer
  * @author Romain
 */
package battleship.serveur;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;

import org.json.JSONObject;

/** List of players connect to the serveur (with soccet or not) */
public class ThreadServeur implements Runnable
{
	/** Membres */
	private Socket socket;
	private LinkedList<PlayersIn> ListOfPlayers;
	/** Constructeur */
	
	public ThreadServeur(Socket sock, LinkedList<PlayersIn> listplayer) 
	{
		socket = sock;
		ListOfPlayers = listplayer;
	}
	
	/** Methodes */
	@Override
	public void run() 
	{
		try
		{
			// flux d'ecriture et de lecture
			PrintWriter out=new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// boucle infinie
			while(true)
			{
				// on recupere a  chaque fois un jsonobject
				JSONObject demande = new JSONObject(in.readLine());
				out.println(demande.get("commande").toString());
			}
		}
		catch (Exception e)
		{
			System.out.println("ThreadServeur : " + e.getMessage());
		}
	}
	
	/** Getter & Setter */
}
