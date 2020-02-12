package pt.goncalo.springplayground.CucumberTest.repository;


import org.springframework.data.repository.CrudRepository;
import pt.goncalo.springplayground.CucumberTest.model.Sample;

/**
 *
 */
public interface SampleRepository extends CrudRepository<Sample, Integer> {
}
