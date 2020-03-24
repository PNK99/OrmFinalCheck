package com.cognizant.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.models.Country;
import com.cognizant.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepo;
	
	
	public List<Country> getAllCountries(){
		List<Country> countries = countryRepo.findAll();
		return countries;
	}
	
	@Transactional
	public List<Country>  searchCountryByName (String searchText){
		return countryRepo.searchCountryByName(searchText);
	}
	
	@Transactional
	public List<Country>  searchCountryByNameAsc (String searchText){
//		return countryRepo.searchCountryByNameAsc(searchText);
	return null;
	}
	
	@Transactional
	public List<Country>  searchCountryByCharacter (Character searchText){
		return countryRepo.searchCountryByCharacter(searchText);
	}

}
