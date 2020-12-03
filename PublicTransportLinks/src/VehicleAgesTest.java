import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class VehicleAgesTest {

	@Test
	public void testVehicleAges()throws ParseException {
		Urodzin bus = new Urodzin();
		int result = bus.vehicleAges("2013");
		assertEquals(3, result);
	}

}
