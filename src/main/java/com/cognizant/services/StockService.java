package com.cognizant.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.models.Stock;
import com.cognizant.repositories.StockRepository;

@Service
public class StockService {
	@Autowired
	private StockRepository stockRepo;

	@Transactional
	public void save(Stock stock) {
		stockRepo.save(stock);
	}

	@Transactional
	public Stock get(Integer id) {
		return stockRepo.findById(id).get();
	}
}
