import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ChangePojazdTest.class, DriverTest.class, EmployeeAgesTest.class, SetArticulateTest.class,
		SetFloorTest.class, setFuelTest.class, SetLineTest.class, VehicleAgesTest.class })
public class AllTests {

}
