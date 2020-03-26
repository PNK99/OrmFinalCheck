package com.cognizant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.models.Cart;
import com.cognizant.models.MenuItem;
import com.cognizant.models.User;
import com.cognizant.repositories.CartRepository;
import com.cognizant.repositories.MenuItemRepository;
import com.cognizant.repositories.UserRepository;

@Service
public class CartService {
	@Autowired
	UserRepository userRepo;

	@Autowired
	CartRepository cartRepo;

	@Autowired
	MenuItemRepository menuRepo;

	public void addCartItem(long userId, long menuItemId) {
		User user = userRepo.findById(userId).get();
		Cart cart = user.getCart();

		MenuItem menu = menuRepo.findById(menuItemId).get();

		cart.getMenuItemList().add(menu);
		cart.setTotal(cart.getTotal() + menu.getPrice());
		cartRepo.save(cart);
	}

	public List<MenuItem> getAllCartItems(long userId) {
		User user = userRepo.findById(userId).get();
		Cart cart = user.getCart();

		return cart.getMenuItemList();
	}

	public void removeCartItem(long userId, long menuItemId) {
		User user = userRepo.findById(userId).get();
		Cart cart = user.getCart();

		MenuItem menu = menuRepo.findById(menuItemId).get();

		cart.getMenuItemList().remove(menu);
		cart.setTotal(cart.getTotal() - menu.getPrice());
		cartRepo.save(cart);
	}
}
