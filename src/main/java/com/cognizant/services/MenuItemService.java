package com.cognizant.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.models.MenuItem;
import com.cognizant.repositories.MenuItemRepository;

@Service
public class MenuItemService  {
	
	@Autowired
	MenuItemRepository menuRepo;
	
	public void setMenuItem(MenuItem menu){
		menuRepo.save(menu);
	}
	
	public List<MenuItem> getMenuItemAdmin(){
		return menuRepo.findAll();
	}
	
	public List<MenuItem> getMenuItemListCustomer(){
		Date today = new Date();
		return menuRepo.getMenuItemListCustomer(today);
	}
	
	public MenuItem getMenuItem(long id) {
		return menuRepo.findById(id).get();
	}
	
	public void editMenuItem(MenuItem menu) {
		menuRepo.save(menu);
	}
	
	
}
