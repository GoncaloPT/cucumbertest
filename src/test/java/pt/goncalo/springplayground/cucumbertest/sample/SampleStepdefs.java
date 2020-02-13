package pt.goncalo.springplayground.cucumbertest.sample;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pt.goncalo.springplayground.cucumbertest.commons.SampleHttpClient;
import pt.goncalo.springplayground.cucumbertest.model.Sample;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleStepdefs {

    @Autowired
    private SampleHttpClient client;

    private HttpStatus responseCode;
    private Object responseData;


    @When("client calls list samples")
    public void clientCallsListSamples() {
        ResponseEntity<Sample[]> response = client.list();
        responseCode = response.getStatusCode();
        responseData = response.getBody();
    }

    @When("client call get sample with {int}")
    public void clientCallGetSampleWith(int id) {
        ResponseEntity<Sample> response = client.get(id);
        responseCode = response.getStatusCode();
        responseData = response.getBody();
    }


    @Then("the client receives OK response")
    public void theClientReceivesOKResponse() {
        assertThat("status is " + responseCode, responseCode, is(HttpStatus.OK));
    }

    @And("the client receives list of samples")
    public void theClientReceivesListOfSamples() {
        assertThat("At list one sample was received", ((Sample[]) responseData).length > 1);
    }


    @And("the client receives sample with id {int}")
    public void theClientReceivesSampleWithId(int id) {
        assertThat("It should receive a sample with the expected id " + id, ((Sample) responseData).getId().equals(id));
    }
}
