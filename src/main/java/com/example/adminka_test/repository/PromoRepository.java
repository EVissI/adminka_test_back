package com.example.adminka_test.repository;

import com.example.adminka_test.models.Promo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = { "*" })
@Repository
public interface PromoRepository extends MongoRepository<Promo, String> {
}