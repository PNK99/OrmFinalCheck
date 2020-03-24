package com.cognizant.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.models.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

	@Query("SELECT s FROM Stock s  WHERE s.date <= '2019-09-31' AND s.date >= '2012-09-01'")
	public List<Stock> getSeptemberStocks();
	
	@Query("SELECT s FROM Stock s WHERE s.code = 'GOOGL' AND s.close > 1250")
	public List<Stock> getGoogleStocksGt1250();

	@Query("SELECT s FROM Stock s ORDER BY s.volume DESC")
	public List<Stock> getHighestVolumeStocks(Pageable pageable);
	
	@Query("SELECT s FROM Stock s WHERE s.code='NFLX' ORDER BY s.volume")
	public List<Stock> getLowestVolumeNetflixStocks(Pageable pageable);
		
}
