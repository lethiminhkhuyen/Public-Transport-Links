import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class EmployeeAgesTest {

	@Test
	public void testEmployeeAges()throws ParseException {
		Urodzin simon = new Urodzin();
		int result = simon.employeeAges("21/04/1987");
		assertEquals(28, result);
	}

}
