package com.example.adminka_test.controller;

import com.example.adminka_test.models.Promo;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;
import com.example.adminka_test.repository.PromoRepository;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PromoController {
    private final PromoRepository promoRepository;

    public PromoController(PromoRepository promoRepository) {
        this.promoRepository = promoRepository;
    }
    @GetMapping("/promo")
    public List<Promo> getAllPromos() {
        return promoRepository.findAll();
    }

    @PostMapping
    public Promo createPromo(@RequestBody Promo promo) {
        return promoRepository.save(promo);
    }

    @GetMapping("/{id}")
    public Promo getPromo(@PathVariable String id) {
        return promoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Promo not found"));
    }

    @PutMapping("/{id}")
    public Promo updatePromo(@PathVariable String id, @RequestBody Promo updatedPromo) {
        Promo promo = promoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Promo not found"));

        promo.setPromoName(updatedPromo.getPromoName());
        promo.setValue(updatedPromo.getValue());
        promo.setStatus(updatedPromo.getStatus());
        promo.setPromoService(updatedPromo.getPromoService());
        promo.setPromoLink(updatedPromo.getPromoLink());

        return promoRepository.save(promo);
    }


    @DeleteMapping("/{id}")
    public void deletePromo(@PathVariable("id") String id) {
        promoRepository.deleteById(id);
    }

}