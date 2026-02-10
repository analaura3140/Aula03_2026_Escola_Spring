package com.petShop.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TutorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomeTutor;
	private LocalDate dataNascimentoTutor;
	
	public TutorEntity() {
		
	}
	
	public TutorEntity(long id, String nomeTutor, LocalDate dataNascimentoTutor) {
		this.id = id;
		this.nomeTutor = nomeTutor;
		this.dataNascimentoTutor = dataNascimentoTutor;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeTutor() {
		return nomeTutor;
	}
	public void setNomeTutor(String nomeTutor) {
		this.nomeTutor = nomeTutor;
	}
	public LocalDate getDataNascimentoTutor() {
		return dataNascimentoTutor;
	}
	public void setDataNascimentoTutor(LocalDate dataNascimentoTutor) {
		this.dataNascimentoTutor = dataNascimentoTutor;
	}
	
	
	
}
