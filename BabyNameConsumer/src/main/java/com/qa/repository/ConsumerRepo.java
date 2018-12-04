package com.qa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.BabyName;

@Repository
public interface ConsumerRepo extends MongoRepository<BabyName, Long> {

}
