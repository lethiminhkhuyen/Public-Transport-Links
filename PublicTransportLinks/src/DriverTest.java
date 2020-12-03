import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class DriverTest {

	@Test
	public void testDriver()throws ParseException {
		Driver v = new Driver("Adam", "Smyk", "21/04/1987", "23/12/2014");
		String result = v.toString();
		assertEquals("Adam Smyk ; Birthdate: 21/04/1987 ; Age: 28 ; License Date: 23/12/2014 ; Driving vehicle: BUS", result);	
	}

}
