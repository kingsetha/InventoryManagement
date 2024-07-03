package com.sample.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.restapp.model.Dealer;


@Repository
public interface DealerRepo extends JpaRepository<Dealer, Integer>{

}
