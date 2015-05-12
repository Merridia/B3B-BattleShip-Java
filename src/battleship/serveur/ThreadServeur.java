/**
  * @author Jennifer & Romain
 */
package battleship.serveur;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//import java.util.LinkedList;


import org.json.JSONObject;

import battleship.controller.Controller;

/** List of players connect to the serveur (with soccet or not) */
public class ThreadServeur implements Runnable
{
	/** Membres */
	private Socket socket;
	@SuppressWarnings("unused")
	private Controller control;
	private PrintWriter out;
	private BufferedReader  in;
	/** Constructeur */
	
	public ThreadServeur(Socket sock) 
	{
		socket = sock;
		System.out.println("Je crée le contrôleur");
		control = new Controller();
		System.out.println("Contrôleur créé");
	}
	
	/** Methodes */
	@Override
	public void run() 
	{
		try
		{
			// flux d'ecriture et de lecture
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
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
	
	public void close () throws Exception
	{
		out.close();
		in.close();
		socket.close();
	}
	
	/** Getter & Setter */
}
