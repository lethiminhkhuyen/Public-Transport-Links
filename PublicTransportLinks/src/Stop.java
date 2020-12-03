import java.util.ArrayList;

public class Stop extends Line{
	
	private String name;
	public String getName()
	{
		return name;
	}
	
	
	public Stop(String a)
	{
		name = a;
	}
	
	 ArrayList<Integer> lineList = new ArrayList<Integer> ();
	 int count;
	 public void addLine(int newLine)
	 {
	 if (count <25)
	 {
		 lineList.add(newLine);
		 count++;
	 }
	 }
	 
	 public void isJunctions()
	 {
		 if(count>=2)
		 {
			 System.out.println("This stop is a junctions.");
		 }
		 else
		 {
			 System.out.println("This stop is not a junctions.");
		 }
	 }
	@Override
	public String toString()
	{
		return name + " ; Lines that stop here: " + lineList ;
	}
	
	public static void main(String[] args) 
	{
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
