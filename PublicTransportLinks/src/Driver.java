import java.text.ParseException;
public class Driver {
	private String firstName, secondName;
	private String birthDate;
	private int age;
	private String licenseDate;
	//public final int BUS = 0, TRAM = 1;
	private final String[] pojazdy = { "BUS", "TRAM"};
	private String pojazd;
	
	public String getName()
	{
		return firstName;
	}
	public String getsurName()
	{
		return secondName;
	}
	public String getBirthDate()
	{
		return birthDate;
	}
	public String getpojazd()
	{
		return pojazd;
	}
	
	public String getLicense()
	{
		return licenseDate;
	}
	
	public int setAge(String birthDate) throws ParseException
	{
		Urodzin person = new Urodzin();
		age = person.employeeAges(birthDate);
		return age;
	}
	
	public void changePojazdy(String tram)
	{
		if (pojazd != tram)
		{
			pojazd = pojazdy[1];
		}
	}
	
	// constructor
	public Driver()
	{
		
	}
	public Driver(String name, String surname, String birthDate, String license)throws ParseException
	{
		firstName = name;
		secondName = surname;
		this.birthDate = birthDate;
		age = this.setAge(birthDate);
		licenseDate = license;
		pojazd = pojazdy[0];
	}
	
@Override
public String toString()
{
	return firstName + " " + secondName + " ; Birthdate: " + birthDate + " ; Age: " + age + " ; License Date: " + licenseDate + " ; Driving vehicle: " + pojazd;
}
}
