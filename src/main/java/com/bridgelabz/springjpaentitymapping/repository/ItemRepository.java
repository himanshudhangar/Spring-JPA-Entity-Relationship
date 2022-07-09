package com.bridgelabz.springjpaentitymapping.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.springjpaentitymapping.entity.Item;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}