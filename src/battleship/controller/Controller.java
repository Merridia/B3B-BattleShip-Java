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
		frameConnect = new ConnectMenuFrame();
		frameConnect.setVisibility(true);
	}
}
