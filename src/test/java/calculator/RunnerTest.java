package calculator;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * JUnit test runner for Cucumber BDD tests
 * Executes all feature files in src/test/resources/features
 */
@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
    features = "src/test/resources/features",
    glue = "calculator",
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunnerTest {
}
