/**
  * @author Jennifer
 */
package battleship.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/** import from the project */
import battleship.client.Client;

/** Client : Set the communication with the server and gave all player's informations (in Json Object/array) to the server */
public class Client 
{
	/** Membres */
	private PrintWriter out;
	private BufferedReader in;
	private String username;
	private static Scanner clavier;
	private Socket socket;

	/** Constructeur : instancie les flux de lecture et d'ecriture apres avoir ouvert le socket */
	public Client() 
	{
		//TODO Rebuild the client to add more informations
		try 
		{
			socket = new Socket("localhost", 1234);
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} 
		catch (Exception e) 
		{
			System.err.println("Client : " + e.getMessage());;
		}
	}
	
	/** Methodes */
	public String demandename () throws JSONException, IOException
	{
		JSONObject demande = new JSONObject();
		demande.put("commande", username);
		out.println(demande);
		String resultat = in.readLine();
		return resultat;
	}
	
	/** Getter & Setter */
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	/** Main : Test communications */
	public static void main(String[] args) throws JSONException, IOException 
	{
		Client client = new Client();
		clavier = new Scanner(System.in);
		// boucle infinie
		while(true) 
		{
			System.out.println("Username : ");
			String name = clavier.next();
			client.username = name;
			String reponse = client.demandename();
			System.out.println("return serv " + reponse);
		}
	}

}