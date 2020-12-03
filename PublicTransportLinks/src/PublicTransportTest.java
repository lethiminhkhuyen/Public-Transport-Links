import java.text.ParseException;

public class PublicTransportTest {
	public static void main(String[] args)throws ParseException
	{
		Driver v = new Driver("Adam", "Smyk", "21/04/1987", "23/12/2014");
		System.out.println(v);
		System.out.println();
		
		v.changePojazdy("Tram");
		System.out.println("After change type of vehicle: " + v);
		System.out.println();
		
		Bus m = new Bus("Darwen", "2014", 3.177, "Gas turbine", 528);
		System.out.println(m);
		System.out.println();
		
		m.setFuel("Gas");
		m.setArticulate("Disarticulate");
		m.setFloor("High");
		System.out.println("After changes: " + m);
		System.out.println();
		
		Vehicles n = new Vehicles("Konstal", "2011", 5.177, 9);
		System.out.println(n);
		System.out.println();
		
		n.setLine(12);
		System.out.println("After changing line: " + n);
		
		Stop first = new Stop("Centralna");
		first.addLine(9);
		first.addLine(20);
		first.addLine(15);
		System.out.println(first);
		first.isJunctions();
		System.out.println();
		
		Stop second = new Stop("Koszykowa");
		second.addLine(7);
		System.out.println(second);
		second.isJunctions();
	}

}
