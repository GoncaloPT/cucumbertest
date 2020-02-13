package pt.goncalo.springplayground.cucumbertest.repository;


import org.springframework.data.repository.CrudRepository;
import pt.goncalo.springplayground.cucumbertest.model.Sample;

/**
 *
 */
public interface SampleRepository extends CrudRepository<Sample, Integer> {
}
