package battleship.core;

public class Case 
{
	private Ship boat;
	private boolean hit;
	
	public Case ()
	{
		boat = null;
		hit = false;
	}
	
	public Case (Ship s) throws NullPointerException
	{
		if(s == null)
		{
			throw new NullPointerException();
		}
		boat = s;
	}
	
	// Getters & Setters
	public Ship getBoat() {
		return boat;
	}

	public void setBoat(Ship boat) {
		this.boat = boat;
	}

	public boolean isHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	// Retourne true si la case contient un b�teau sinon false
	public boolean IsEmpty()
	{
		return boat == null ? true : false;
	}
	
	// Attaque du b�teau s'il existe sur la case et qu'elle n'a pas d�j� �t� attaqu�
	public Ship hit ()
	{
		if(boat != null && hit == false)
		{
			boat.incDomage();
			hit = true;
			return boat;
		}
		else if(hit == false)
		{
			hit = true;
		}
		return null;
	}
	
	// Suppression du b�teau sur la case
	public void removeShip()
	{
		boat = null;
	}
}
