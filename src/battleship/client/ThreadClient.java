package battleship.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadClient extends Thread {
	
	//Cr�ation d'�l�ment de connexion (A DES FIN DE TEST UNIQUEMENT)
	public ServerSocket server;
	public Socket connection;
	//Ajout d'un compteur
	public int counter = 1;
	//Cr�ation d"object systeme
	public PrintWriter opt;
	public BufferedReader ipt;
	//D�finition du socket
	public Socket socket;
	// The queue, thread-safe for good measure
	public Queue<String> queue = new ConcurrentLinkedQueue<String>();
		  
	//Cr�ation de la file d'attente
	public Object sendQueue;
	
	//cr�ation du socket
	public ThreadClient(Socket m_socket) throws IOException {
		m_socket = socket;
	  }

	//test
	  public void run() {
		  
			try 
			{
				@SuppressWarnings("resource")
				Socket m_socket = new Socket("localhost", 1234);
				opt = new PrintWriter(m_socket.getOutputStream(), true);
				ipt = new BufferedReader(new InputStreamReader(m_socket.getInputStream()));
			} catch (Exception e) 
			{
				System.err.println("Client : " + e.getMessage());;
			}
	  }
}