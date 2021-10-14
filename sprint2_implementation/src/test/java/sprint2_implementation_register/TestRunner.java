package sprint2_implementation_register;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Lenovo/Downloads/sprint2_implementation/src/test/resources/features/Main.feature",
glue= {"sprint2_implementation_register"},plugin = {"json:target/reports/report.json","junit:target/reports/report.xml"}
,publish=true)


public class TestRunner {

	
}
