package battleship.frame;

import javax.swing.JFrame;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import battleship.controller.Controller;

public abstract class AbstractFrame 
{
	private JFrame mainFrame;
	
	private Controller controller;
	
	public AbstractFrame (Controller controllerMain)
	{
		controller = controllerMain;
		mainFrame = new JFrame();
		defaultFrameBehaviour();
	}
	
	// Getters & Setters
	public JFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(JFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}


	//Fermeture de la fenêtre
	public void closeView ()
	{
		mainFrame.dispose();
	}
	
	// Comportement par défaut de la fenêtre
	private void defaultFrameBehaviour ()
	{
		mainFrame.setTitle(getTitle());
		mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	
	public void display()
	{
		mainFrame.setVisible(true);
	}
	
	public void hide()
	{
		mainFrame.setVisible(false);
	}
	
	// Méthode abstraite devant être redéfini par les frames héritières
	public abstract String getTitle();
}
