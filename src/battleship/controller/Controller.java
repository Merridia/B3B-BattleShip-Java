/**
  * @author Jennifer & Romain
 */
package battleship.controller;

import battleship.frame.*;

public class Controller 
{
	private ConnectMenuFrame frameConnect;
	
	public Controller()
	{
		System.out.println("Je vais créer le frameconnect");
		frameConnect = new ConnectMenuFrame();
		System.out.println("frameConnect créé");
		frameConnect.setVisible(true);
		System.out.println("frameconnect visible");
	}
}
