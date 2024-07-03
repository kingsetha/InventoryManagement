package com.sample.restapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.sample.restapp.model.Shop;
import com.sample.restapp.serviceimplementation.ShopServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/shop")
@CrossOrigin("http://localhost:3000")
public class ShopController {

	
	ShopServiceImpl service;
	
	public ShopController(ShopServiceImpl service) {
		super();
		this.service = service;
	}
	static final String SUCCESS = "success";
	static final String FAILURE = "failure";
	@PostMapping
	public String insertShop(@RequestBody Shop mob) {
		String msg = "";
		try {
			service.addShop(mob);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}
	@GetMapping("{id}")
	public Shop getShopById(@PathVariable("id") int id)
	{
		return service.getShop(id);
	}
	@GetMapping("/all")
	public List<Shop> getShops()
	{
		return service.getAllShops();
	}

	@PutMapping
	public String updateShop(@RequestBody Shop mob) {
		String msg = "";
		try {
			service.updateShop(mob);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}
	@DeleteMapping("{id}")
	public String deleteShopById(@PathVariable("id") int id)
	{
		String msg = "";
		try {
			service.deleteShop(id);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}

}
