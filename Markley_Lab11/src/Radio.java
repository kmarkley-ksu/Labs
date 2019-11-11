public class Radio
{
	//Class variables
	int volume, station;
	boolean on;
	
	//Constructor
	public Radio()
	{
		this.volume = 1;
		this.station = 1;
		this.on = false;
	}
	
	//Getters
	public int GetVolume()
	{
		return this.volume;
	}
	public int GetStation()
	{
		return this.station;
	}
	
	//Setters
	public void VolumeUp()
	{
		this.volume++;
	}
	public void VolumeDown()
	{
		this.volume--;
	}
	public void StationUp()
	{
		this.station++;
	}
	public void StationDown()
	{
		this.station--;
	}
	public void TurnOn()
	{
		this.on = true;
	}
	public void TurnOff()
	{
		this.on = false;
	}
	
	//Print method
	@Override
	public String toString()
	{
		if(this.on)
		{
			return "Radio " + this.hashCode() + " is on station " + 
					this.station + " and the volume level is " + 
					this.volume;
		}
		else
			return "Radio " + this.hashCode() + " is off";
	}
}
