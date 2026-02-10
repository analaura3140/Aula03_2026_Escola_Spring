package com.petShop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petShop.entities.TipoEntity;

public interface TipoRepository extends JpaRepository<TipoEntity, Long>{

}
