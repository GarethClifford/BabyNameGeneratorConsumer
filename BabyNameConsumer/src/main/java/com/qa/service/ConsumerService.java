package com.qa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.BabyName;
import com.qa.repository.ConsumerRepo;

@Service
public class ConsumerService {

	@Autowired
	private ConsumerRepo repo;
	
	public void setRepo(ConsumerRepo persist) {
		this.repo = persist;
	}
	
	public Iterable<BabyName> getAll() {
		return repo.findAll();
	}
	
	public BabyName add(BabyName babyName) {
		return repo.save(babyName);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public Optional<BabyName> get(Long id) {
		return repo.findById(id);
	}
	
}
