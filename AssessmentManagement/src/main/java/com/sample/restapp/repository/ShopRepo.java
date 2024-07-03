package com.sample.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.restapp.model.Shop;


@Repository
public interface ShopRepo extends JpaRepository<Shop, Integer>{

}
