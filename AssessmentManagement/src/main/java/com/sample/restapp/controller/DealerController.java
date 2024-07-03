package com.sample.restapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.sample.restapp.model.Dealer;
import com.sample.restapp.serviceimplementation.DealerServiceImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/dealer")
@CrossOrigin("http://localhost:3000")
public class DealerController {

	
	DealerServiceImpl service;
	
	public DealerController(DealerServiceImpl service) {
		super();
		this.service = service;
	}
	static final String SUCCESS = "success";
	static final String FAILURE = "failure";
	@PostMapping
	public String insertDealer(@RequestBody Dealer rep) {
		String msg = "";
		try {
			service.addDealer(rep);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}
	@GetMapping("{id}")
	public Dealer getDealerById(@PathVariable("id") int id)
	{
		return service.getDealer(id);
	}
	@GetMapping("/all")
	public List<Dealer> getDealers()
	{
		return service.getAllDealers();
	}

	@PutMapping
	public String updateDealer(@RequestBody Dealer rep) {
		String msg = "";
		try {
			service.updateDealer(rep);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}
	@DeleteMapping("{id}")
	public String deleteDealerById(@PathVariable("id") int id)
	{
		String msg = "";
		try {
			service.deleteDealer(id);
			msg = SUCCESS;
		} catch (Exception e) {
			msg = FAILURE;
		}

		return msg;
	}

}
