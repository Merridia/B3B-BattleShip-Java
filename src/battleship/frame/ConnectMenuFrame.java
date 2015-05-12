/**
  * @author Romain & Jennifer
 */
package battleship.frame;

import javax.swing.JFrame;

import battleship.gamepanel.*;

public class ConnectMenuFrame extends JFrame
{
	static final long serialVersionUID=0;
	
	private ConnectPanel panelConnect;
	
	public ConnectMenuFrame ()
	{
		setTitle("Batlleship Connection");
		setSize(900, 600);
		add(panelConnect);
	}
}
