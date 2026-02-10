package com.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomeTipo;
	private String descricaoTipo;
	
	public TipoEntity() {
		
	
	}
	
	public TipoEntity(long id, String nomeTipo, String descricaoTipo) {
		this.id = id;
		this.nomeTipo =nomeTipo;
		this.descricaoTipo = descricaoTipo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeTipo() {
		return nomeTipo;
	}
	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
	public String getDescricaoTipo() {
		return descricaoTipo;
	}
	public void setDescricaoTipo(String descricaoTipo) {
		this.descricaoTipo = descricaoTipo;
	}
	
	
}
