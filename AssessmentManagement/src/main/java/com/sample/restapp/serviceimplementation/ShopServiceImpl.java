package com.sample.restapp.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sample.restapp.model.Shop;
import com.sample.restapp.repository.ShopRepo;
import com.sample.restapp.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {

	ShopRepo repo;

	public ShopServiceImpl(ShopRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addShop(Shop shop) {

		repo.save(shop);

	}

	@Override
	public Shop getShop(int id) {

		Optional<Shop> shopOptional = repo.findById(id);
		return shopOptional.orElse(null);

	}

	public List<Shop> getAllShops() {

		return repo.findAll();
	}

	@Override
	public void updateShop(Shop shop) {
		repo.save(shop);

	}

	@Override
	public void deleteShop(int id) {
		repo.deleteById(id);

	}

}
