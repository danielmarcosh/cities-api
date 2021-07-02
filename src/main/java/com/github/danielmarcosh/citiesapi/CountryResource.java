package com.github.danielmarcosh.citiesapi;

import antlr.ASTNULLType;
import com.github.danielmarcosh.citiesapi.countries.Country;
import com.github.danielmarcosh.citiesapi.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("countries")
public class CountryResource {
    private CounterRepository repository;

    public CountryResource(CounterRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> countries(){
    return repository.findAll();
    }
}
