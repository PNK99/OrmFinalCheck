package com.cognizant.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

	@Query("SELECT c FROM  Country c WHERE c.name LIKE %?1")
	List<Country> searchCountryByName(String searchText);
	
	
	@Query("SELECT c FROM Country c WHERE c.name LIKE %?1 ORDER BY c.name")
	public List<Country> searchCountryByNameAsc(String searchText);
	
	@Query("SELECT c FROM Country c WHERE c.name LIKE ?1%")
	public List<Country> searchCountryByCharacter(Character searchText);
}