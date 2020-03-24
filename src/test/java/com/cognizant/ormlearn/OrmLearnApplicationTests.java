package com.cognizant.ormlearn;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import com.cognizant.models.Country;
import com.cognizant.repositories.StockRepository;
import com.cognizant.services.CountryService;

@SpringBootTest
class OrmLearnApplicationTests {
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StockRepository stockRepo;
	
	@Test
	public void testGetAllCountries() {

		List<Country> countries = countryService.getAllCountries();
		assertFalse(countries.isEmpty());

	}
	
	@Test
	
	public void testQueries() {


		System.out.println(stockRepo.getLowestVolumeNetflixStocks( PageRequest.of(0, 3)));
		System.out.println(stockRepo.getHighestVolumeStocks(PageRequest.of(0, 3)));
		System.out.println(stockRepo.getGoogleStocksGt1250());
		System.out.println(stockRepo.getSeptemberStocks());
		assertTrue(true);
	}
	
	

}
