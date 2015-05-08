package battleship.core;

import java.util.List;

public class Player 
{
	// Donn�es membres
	private String name;
	private Integer numberShots;
	private Radar ennemySea;
	private Grid sea;
	private List<Boat> fleet;
	private Contact target;
	
	// Cr�e un joueur avec un nom
	public Player (String nom)
	{
		name = nom;
		fleet = new List<Boat> ();
		sea = new Grid ();
		numberShots = 0;
	}
	
	//Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberShots() {
		return numberShots;
	}

	public void setNumberShots(Integer numberShots) {
		this.numberShots = numberShots;
	}

	public Radar getEnnemySea() {
		return ennemySea;
	}

	public void setEnnemySea(Radar ennemySea) {
		this.ennemySea = ennemySea;
	}

	public Grid getSea() {
		return sea;
	}

	public void setSea(Grid sea) {
		this.sea = sea;
	}

	public List<Boat> getFleet() {
		return fleet;
	}

	public void setFleet(List<Boat> fleet) {
		this.fleet = fleet;
	}

	public Contact getTarget() {
		return target;
	}

	public void setTarget(Contact target) throws Exception
	{
		if(target == null)
		{
			throw new Exception ("Les coordonn�es de tir sont incorrectes.");
		}
		this.target = target;
	}

	// R�cup�ration du radar de l'ennemi
	public void InitRadar (Radar ennemyGrid) throws NullPointerException
	{
		if(ennemyGrid == null)
		{
			throw new NullPointerException("Le rardar fourni au joueur" + name + "est incorrect.");
		}
		ennemySea = ennemyGrid;
		numberShots = 0;
	}
	
	// Lance une attaque en renvoyant les coordonn�es de l'attaque
	public Contact LaunchAttack ()
	{
		numberShots++;
		return target;
	}
	
	//Renvoie la case correspondante aux coordonn�es pass�es en param�tres
	public Case getCase (Contact contact)
	{
		return getSea().getSea()[contact.getY()][contact.getX()];
	}
	
	
}
