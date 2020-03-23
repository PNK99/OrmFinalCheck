package com.cognizant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.models.Country;
import com.cognizant.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository countryRepo;
	
	
	public List<Country> getAllCountries(){
		List<Country> countries = countryRepo.findAll();
		return countries;
	}
}
