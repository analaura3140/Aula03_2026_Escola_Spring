package com.petShop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petShop.entities.ChipEntity;

public interface ChipRepository extends JpaRepository<ChipEntity, Long> {

	
}
