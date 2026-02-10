package com.petShop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petShop.entities.PetEntity;

public interface PetRepository extends JpaRepository <PetEntity, Long> {

}
