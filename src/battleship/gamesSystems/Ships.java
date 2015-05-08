package battleship.gamesSystems;

public class Ships {
	
	public String name;
	
	public int sX;
	public int sY;
	//Add enum Status
	public ShipStatus status ;
	//Lenght of the ship
	public int lenght;
	
	//TODO Ship's Constructer
	public Ships(String s_Name, int s_X, int s_Y, int s_Lenght){
		
		name = s_Name;
		sX = s_X;
		sY= s_Y;
		status = ShipStatus.alive;
		lenght = s_Lenght;
	}
}
