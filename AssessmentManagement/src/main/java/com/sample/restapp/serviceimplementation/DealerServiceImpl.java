package com.sample.restapp.serviceimplementation;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.sample.restapp.model.Dealer;
import com.sample.restapp.repository.DealerRepo;
import com.sample.restapp.service.DealerService;

@Service
public class DealerServiceImpl implements DealerService {

	DealerRepo repo;

	public DealerServiceImpl(DealerRepo repo) {
		super();
		this.repo = repo;
	}

	public void addDealer(Dealer dealer) {
		repo.save(dealer);

	}

	public Dealer getDealer(int id) {
		Optional<Dealer> dealerOptional = repo.findById(id);
		return dealerOptional.orElse(null);

	}

	public List<Dealer> getAllDealers() {

		return repo.findAll();
	}

	public void updateDealer(Dealer dealer) {
		repo.save(dealer);

	}

	public void deleteDealer(int id) {
		repo.deleteById(id);

	}

}
