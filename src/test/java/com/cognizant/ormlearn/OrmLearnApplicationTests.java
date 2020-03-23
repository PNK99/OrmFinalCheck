package com.cognizant.ormlearn;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.models.Country;
import com.cognizant.services.CountryService;

@SpringBootTest
class OrmLearnApplicationTests {
	@Autowired
	private CountryService countryService;
	
	@Test
	public void testGetAllCountries() {

		List<Country> countries = countryService.getAllCountries();
		assertFalse(countries.isEmpty());

	}
	
	

}
