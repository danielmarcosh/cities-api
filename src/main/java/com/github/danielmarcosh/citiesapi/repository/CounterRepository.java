package com.github.danielmarcosh.citiesapi.repository;

import com.github.danielmarcosh.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository<Country, Long> {
}
