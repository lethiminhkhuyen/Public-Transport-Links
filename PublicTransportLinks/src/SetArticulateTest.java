import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class SetArticulateTest {

	@Test
	public void test() throws ParseException {
		Vehicles v = new Vehicles("Newag", "2010", 4.159, 10);
		v.setArticulate("Disarticulate");
		String result = v.toString();
		assertEquals("TRAM  ; Producer: Newag ; Manufacturer year: 2010 ; Age: 6 ; Vehicle's mileage: 4.159 ; Floor type: LOW ; DISARTICULATED ; Line: 10", result);
	}

}
