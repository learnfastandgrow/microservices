package com.data.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.restapi.entity.Country;
import com.data.restapi.repo.CountryRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CountryService {
	
	@Autowired
	private CountryRepository commonRepository;

	public Country save(Country country) {
		log.info("calling save method");
		return commonRepository.save(country);
	}

	public List<Country> getCountries() {
		log.info("calling getCountries");
		return commonRepository.findAll();
	}

	public List<Country> getCountryById(Long id) {
		return commonRepository.getCountryById(id);
	}
	
	

}
