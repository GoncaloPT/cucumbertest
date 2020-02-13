package pt.goncalo.springplayground.cucumbertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/",
        plugin = {"pretty","html:output"},
        extraGlue = "pt.goncalo.springplayground.CucumberTest.commons"
)
public class SampleIntegrationTest {
}
