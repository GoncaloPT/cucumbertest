package pt.goncalo.springplayground.CucumberTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/",
        plugin = {"pretty"},
        extraGlue = "pt.goncalo.springplayground.CucumberTest.commons"
)
public class SampleIntegrationTest {
}
