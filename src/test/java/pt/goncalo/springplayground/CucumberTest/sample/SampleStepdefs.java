package pt.goncalo.springplayground.CucumberTest.sample;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pt.goncalo.springplayground.CucumberTest.commons.SampleHttpClient;
import pt.goncalo.springplayground.CucumberTest.model.Sample;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleStepdefs {

    @Autowired
    private SampleHttpClient client;
    ResponseEntity<Sample[]> response;

    @When("client calls list samples")
    public void clientCallsListSamples() {
        response = client.list();

    }

    @Then("the client receives OK response")
    public void theClientReceivesOKResponse() {
        assertThat("status is 200" + response.getStatusCode(), response.getStatusCode(), is(HttpStatus.OK));
    }

    @And("the client receives list of samples")
    public void theClientReceivesListOfSamples() {
        assertThat("At list one sample was received", response.getBody().length > 1);
    }

    @When("client call get sample with {int}")
    public void clientCallGetSampleWith(int id) {
        
    }

    @And("the client receives sample with id {int}")
    public void theClientReceivesSampleWithId(int id) {
    }
}
