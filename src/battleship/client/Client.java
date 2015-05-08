package battleship.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import battleship.client.Client;

public class Client 
{
	private PrintWriter out;
	private BufferedReader in;
	private String username;

	// Constructeur : instancie les flux de lecture et d'ecriture apres avoir ouvert le socket
	public Client() 
	{
		try 
		{
			Socket socket = new Socket("localhost", 1234);
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} 
		catch (Exception e) 
		{
			System.err.println("Client : " + e.getMessage());;
		}
	}
	
	public String demandename () throws JSONException, IOException
	{
		JSONObject demande = new JSONObject();
		demande.put("commande", username);
		out.println(demande);
		String resultat = in.readLine();
		return resultat;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public static void main(String[] args) throws JSONException, IOException 
	{
		Client client = new Client();
		Scanner clavier = new Scanner(System.in);
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
