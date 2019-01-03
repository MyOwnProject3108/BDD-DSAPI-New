package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\Resources",
        glue = "C:\\Users\\Faiyyaz.Shaik\\entellitrack\\src\\test\\java\\StepDefinitions",
        tags= {"@test1"})

public class RunnerClass {

}
