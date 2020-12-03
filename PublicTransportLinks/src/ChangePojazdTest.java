import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class ChangePojazdTest {

	@Test
	public void testChangePojazd() throws ParseException {
		Driver v = new Driver("John", "Snow", "29/07/1980", "21/12/2014");
		v.changePojazdy("Tram");
		String result = v.toString();
		assertEquals("John Snow ; Birthdate: 29/07/1980 ; Age: 35 ; License Date: 21/12/2014 ; Driving vehicle: TRAM", result);	
	}

}
