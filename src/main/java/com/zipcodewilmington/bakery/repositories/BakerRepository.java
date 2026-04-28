package com.zipcodewilmington.bakery.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zipcodewilmington.bakery.models.Baker;
@Repository
public interface BakerRepository extends CrudRepository<Baker, Long> {
}
