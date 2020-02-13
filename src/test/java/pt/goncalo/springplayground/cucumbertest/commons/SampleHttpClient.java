package pt.goncalo.springplayground.cucumbertest.commons;

import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pt.goncalo.springplayground.cucumbertest.model.Sample;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class SampleHttpClient {


    @LocalServerPort
    private int port;
    private final RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<Sample[]> list(){
        return restTemplate.getForEntity("http://localhost:"+port+"/sample/", Sample[].class);
    }
    public ResponseEntity<Sample> get(Integer id ){
        return restTemplate.getForEntity("http://localhost:"+port+"/sample/" +id, Sample.class);
    }

}
