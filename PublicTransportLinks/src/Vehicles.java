import java.text.ParseException;

public class Vehicles extends Line
{
	protected String producer, manufacturer;
	protected double mileage;
	protected final static String[] floors = {"LOW", "HIGH"};
	protected String floor;
	protected final static String[] articulates = {"ARTICULATED", "DISARTICULATED"};
	protected String articulate;
	protected final static String[] types = {"BUS", "TRAM"};
	protected String type;
	protected int age;
	public String getProducer()
	{
		return producer;
	}
	public String getManufacturer()
	{
		return manufacturer;
	}
	public double getMileage()
	{
		return mileage;
	}
	public String getFloor()
	{
		return floor;
	}
	public String getArticulate()
	{
		return articulate;
	}
	
	public String getType()
	{
		return type;
	}
	public int getAge()
	{
		return age;
	}
	
	public int setAge(String manufacturer) throws ParseException
	{
		Urodzin bus = new Urodzin();
		age = bus.vehicleAges(manufacturer);
		return age;
	}

	public void setFloor (String vehicleFloor)
	{
		if(floor != vehicleFloor)
		{
			floor = floors[1];
		}
	}
	public void setArticulate(String vehicleArt)
	{
		if(articulate != vehicleArt)
		{
			articulate = articulates[1];
		}
	}
	
	public void setLine(int e)
	{
		if (line == e)
		{
			System.out.println("This vehicle is already in line " + e);
		}
		else
		{
			line = e;
		}
	}
	
	//constructor
		public Vehicles()
		{
			
		}
		public Vehicles(String n, String d, double m, int l)throws ParseException
		{
			producer = n;
			manufacturer  = d;
			age = this.setAge(d);
			mileage = m;
			floor = floors[0];
			articulate = articulates[0];
			type = types[1];
			line = l;
		}

		@Override
		public String toString()
		{
			return type + " " + " ; Producer: " + producer + " ; Manufacturer year: " + manufacturer + " ; Age: " + age + " ; Vehicle's mileage: " + mileage + " ; Floor type: " + floor + " ; " + articulate + " ; Line: " + line;
		}
		
		
}