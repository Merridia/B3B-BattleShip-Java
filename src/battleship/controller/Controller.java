/**
  * @author Jennifer & Romain
 */
package battleship.controller;

import battleship.frame.*;
import battleship.gamepanel.LobbyPanel;

public class Controller 
{
	private ConnectMenuFrame frameConnect;
	private LobbyFrame frameLobby;
	private GameFrame frameGame;
	
	public Controller()
	{
		System.out.println("Je vais créer le frameconnect");
		frameConnect = new ConnectMenuFrame();
		System.out.println("frameConnect créé");
		frameConnect.setVisible(true);
		System.out.println("frameconnect visible");
	}
	
	public void changePanelToLobby ()
	{
		frameConnect.setVisible(false);
		frameLobby = new LobbyFrame();
		frameLobby.setVisible(true);
	}
	
	public void changePanelToGame ()
	{
		frameLobby.setVisible(false);
		frameGame = new GameFrame();
		frameGame.setVisible(true);
	}
}
