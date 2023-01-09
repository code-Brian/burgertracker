package com.burgertracker.repositories;

import org.springframework.data.repository.CrudRepository;

import com.burgertracker.models.Burger;

public interface BurgerRepository extends CrudRepository<Burger, Long>{

}
