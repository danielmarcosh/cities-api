package com.github.danielmarcosh.citiesapi;

import com.github.danielmarcosh.citiesapi.countries.Country;
import com.github.danielmarcosh.citiesapi.repository.CounterRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("countries")
public class CountryResource {
    private CounterRepository repository;

    public CountryResource(CounterRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<Country> countries(Pageable page){
    return repository.findAll(page);
    }
}
