package com.petShop.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PetEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomePet;
	private int tamanhoPet;
	private LocalDate dataNascimentoPet;
	
    public PetEntity() {
		
	}

    public PetEntity(long id, String nomePet, int tamanhoPet, LocalDate dataNascimentoPet) {
		this.id = id;
		this.nomePet =nomePet;
		this.tamanhoPet = tamanhoPet;
		this.dataNascimentoPet = dataNascimentoPet;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomePet() {
		return nomePet;
	}
	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
	public int getTamanhoPet() {
		return tamanhoPet;
	}
	public void setTamanhoPet(int tamanhoPet) {
		this.tamanhoPet = tamanhoPet;
	}
	public LocalDate getDataNascimentoPet() {
		return dataNascimentoPet;
	}
	public void setDataNascimentoPet(LocalDate dataNascimentoPet) {
		this.dataNascimentoPet = dataNascimentoPet;
	}
	
	
	
}
