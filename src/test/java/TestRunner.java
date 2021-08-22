import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/"
        , glue = {"stepdefinitions"}
        , monochrome = false
        , plugin = {"pretty"})
public class TestRunner {
}
