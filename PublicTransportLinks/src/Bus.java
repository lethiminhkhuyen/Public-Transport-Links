import java.text.ParseException;

//import java.text.ParseException;

public class Bus extends Vehicles {
	private final static String[] fuels = {"OIL", "GAS"};
	private String fuel;
	private String engine;
	
	public String getFuel()
	{
		return fuel;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public void setFuel(String newFuelType)
	{
		if (fuel != newFuelType) 
		{
			fuel = fuels[1];
		}
	}
	
	//constructor
	public Bus ()
	{
		
	}
	public Bus(String n, String d, double m, String ec, int l)throws ParseException
	{
		producer = n;
		manufacturer  = d;
		age = this.setAge(d);
		mileage = m;
		floor = floors[0];
		articulate = articulates[0];
		engine = ec;
		fuel = fuels[0];
		type = types[0];
		line = l;
	}
	@Override
	public String toString()
	{
		return type + " " + " ; Producer: " + producer + " ; Manufacturer year: " + manufacturer + " ; Age: " + age + " ; Engine type: " + engine + " ; Fuel type: " + fuel + " ; Vehicle's mileage: " + mileage + " ; Floor type: " + floor + " ; " + articulate + " ; Line: " + line;
	}
}
