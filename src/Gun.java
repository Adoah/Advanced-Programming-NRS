public class Gun extends Weapon
{
	//attributes
	private double caliber;
	private int ammo;
	private boolean isAutomatic;
	
	//constructor
	public Gun()
	{
		this.isAutomatic = false;
	}
	//mutator
	public double getCaliber()
	{
		return this.caliber;
	}
	public int getAmmo()
	{
		return this.ammo;
	}
	public void setCaliber(double caliber)
	{
		this.caliber = caliber;
	}
	public void setAmmo(int ammo)
	{
		this.ammo = ammo;
	}
	public String toString()
	{
		return super.toString() + "the caliber is: " + this.caliber + "it has " + this.ammo + " bullets.";
	}
}
