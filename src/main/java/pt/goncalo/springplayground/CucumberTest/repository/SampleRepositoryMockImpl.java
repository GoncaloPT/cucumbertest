package pt.goncalo.springplayground.CucumberTest.repository;

import org.springframework.stereotype.Component;
import pt.goncalo.springplayground.CucumberTest.model.Sample;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Component
public class SampleRepositoryMockImpl implements SampleRepository {

    private static final Stream<Sample> SAMPLE_STREAM = Stream.of(
            new Sample(1,"outro",1),
            new Sample(2,"o dois",2)
            );
    @Override
    public <S extends Sample> S save(S s) {
        return null;
    }

    @Override
    public <S extends Sample> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Sample> findById(Integer integer) {
        return SAMPLE_STREAM.filter(sample -> sample.getId().equals(integer)).findAny();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Sample> findAll() {
        return SAMPLE_STREAM.collect(Collectors.toList());
    }

    @Override
    public Iterable<Sample> findAllById(Iterable<Integer> iterable) {
        List<Integer> ids = StreamSupport.stream(iterable.spliterator(),false).collect(Collectors.toList());
        return SAMPLE_STREAM.filter(sample -> ids.contains(sample.getId())).collect(Collectors.toList());
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Sample sample) {

    }

    @Override
    public void deleteAll(Iterable<? extends Sample> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
