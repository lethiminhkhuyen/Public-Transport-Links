import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class SetLineTest {

	@Test
	public void test() throws ParseException {
		Vehicles v = new Vehicles("Konstal", "2011", 5.177, 9);
		v.setLine(12);
		String result = v.toString();
		assertEquals("TRAM  ; Producer: Konstal ; Manufacturer year: 2011 ; Age: 5 ; Vehicle's mileage: 5.177 ; Floor type: LOW ; ARTICULATED ; Line: 12", result);
	}

}
