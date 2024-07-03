package com.sample.restapp.service;

import java.util.List;

import com.sample.restapp.model.Shop;

public interface ShopService {

	public void addShop(Shop shop);

	public Shop getShop(int id);

	public List<Shop> getAllShops();

	public void updateShop(Shop shop);

	public void deleteShop(int id);

}
