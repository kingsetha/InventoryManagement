package com.sample.restapp.service;

import java.util.List;

import com.sample.restapp.model.Dealer;

public interface DealerService {

	public void addDealer(Dealer dealer);

	public Dealer getDealer(int id);

	public List<Dealer> getAllDealers();

	public void updateDealer(Dealer dealer);

	public void deleteDealer(int id);
}
