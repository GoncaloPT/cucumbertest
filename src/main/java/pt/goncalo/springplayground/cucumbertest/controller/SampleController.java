package pt.goncalo.springplayground.cucumbertest.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.goncalo.springplayground.cucumbertest.exceptions.EntityNotFoundException;
import pt.goncalo.springplayground.cucumbertest.model.Sample;
import pt.goncalo.springplayground.cucumbertest.repository.SampleRepositoryMockImpl;

/**
 * Just a sample REST Controller
 */
@RestController
@AllArgsConstructor
@Log4j2
@RequestMapping("/sample")
public class SampleController {

    private SampleRepositoryMockImpl repository;

    @GetMapping("/")
    public Iterable<Sample> list() {
        log.debug("list called");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Sample getOne(@PathVariable("id") Integer id) throws EntityNotFoundException {
        log.debug("getOne called with {0}", id);
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

}
