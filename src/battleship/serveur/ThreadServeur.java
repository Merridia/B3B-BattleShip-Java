package battleship.serveur;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.json.JSONObject;

public class ThreadServeur implements Runnable
{
	private Socket socket;
	
	public ThreadServeur(Socket sock) 
	{
		socket = sock;
	}
	
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
}
