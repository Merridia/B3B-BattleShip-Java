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

import battleship.controller.Controller;

/** List of players connect to the serveur (with soccet or not) */
public class ThreadServeur implements Runnable
{
	/** Membres */
	private Socket socket;
	private Controller control;
	/** Constructeur */
	
	public ThreadServeur(Socket sock) 
	{
		socket = sock;
		System.out.println("Je cr�e le contr�leur");
		control = new Controller();
		System.out.println("Contr�leur cr��");
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
				// on recupere a� chaque fois un jsonobject
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
