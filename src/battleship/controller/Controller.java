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
		System.out.println("Je vais cr�er le frameconnect");
		frameConnect = new ConnectMenuFrame();
		System.out.println("frameConnect cr��");
		frameConnect.setVisible(true);
		System.out.println("frameconnect visible");
	}
}
