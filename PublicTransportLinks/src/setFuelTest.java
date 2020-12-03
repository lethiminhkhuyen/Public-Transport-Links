import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class setFuelTest {

	@Test
	public void test() throws ParseException {
		Bus v = new Bus("Darwen", "2014", 3.177, "Gas turbine", 528);
		v.setFuel("Gas");
		String result = v.toString();
		assertEquals("BUS  ; Producer: Darwen ; Manufacturer year: 2014 ; Age: 2 ; Engine type: Gas turbine ; Fuel type: GAS ; Vehicle's mileage: 3.177 ; Floor type: LOW ; ARTICULATED ; Line: 528", result);
	}

}
