package com.cognizant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.models.Cart;

public interface CartRepository extends JpaRepository<Cart	, Long> {

}
