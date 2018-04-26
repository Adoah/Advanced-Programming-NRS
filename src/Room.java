
public class Room 
{
	private int x, y;
	
	public Room(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String getPosition()
	{
		return Integer.toString(x) + ", " + Integer.toString(y);
	}
}
