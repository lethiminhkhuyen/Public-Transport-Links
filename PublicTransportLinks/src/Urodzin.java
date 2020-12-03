import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Urodzin
{
	private int year;
	private int month;
	private int day;

	public int getYear()
	{
		return this.year;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getDay()
	{
		return this.day;
	}
	// constructor
	public Urodzin()
	{

	}
	public Urodzin(int year)
	{
		this.year = year;
	}
	@Override
	public String toString()
	{
		String ages = Integer.toString(year);
		return ages;
	}

	public static int calculateAge(Date birthDate)
	{
		int years;
		int months;
		int days;
		//calendar object for birthday
		Calendar birthDay = Calendar.getInstance();
		birthDay.setTimeInMillis(birthDate.getTime());
		//calendar object for current time
		long currentTime = System.currentTimeMillis();
		Calendar now = Calendar.getInstance();
		now.setTimeInMillis(currentTime);
		//difference in years
		int currY = now.get(Calendar.YEAR);
		int birthY = birthDay.get(Calendar.YEAR);
		int currM = now.get(Calendar.MONTH) + 1;
		int birthM = birthDay.get(Calendar.MONTH) + 1;
		int currD = now.get(Calendar.DATE);
		int birthD = birthDay.get(Calendar.DATE);
		days = currD - birthD;
		//counting ages
		if(days < 0)
		{
			birthM++;
			months = currM - birthM;
			if (months < 0)
			{
				birthY++;
				years = currY - birthY; 
			}
			else
			{
				years = currY - birthY;
			}
		}
		else
		{
			months = currM - birthM;
			if (months < 0)
			{
				birthY++;
				years = currY - birthY; 
			}
			else
			{
				years = currY - birthY;
			}
		}
		return years;
		
	}
	
	// setting empoyer ages
	public int employeeAges(String sdf)throws ParseException
	{
		SimpleDateFormat newDate = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate = newDate.parse(sdf);
		int age = calculateAge(birthDate);
		return age;
	}
	
	// Setting vehicle ages
	public int vehicleAges(String sdf2) throws ParseException
	{
		SimpleDateFormat newDate = new SimpleDateFormat("yyyy");
		Date manufacturerDate = newDate.parse(sdf2);
		int age = calculateAge(manufacturerDate);
		return age;
	}
}

