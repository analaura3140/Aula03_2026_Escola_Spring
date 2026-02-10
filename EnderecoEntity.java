package com.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EnderecoEntity {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private long id;
	private String nomeRua;
	private int numeroCasa;
	private String nomeBairro;
	private String nomeCidade;
	
	public EnderecoEntity() {
		
	}
	
	public EnderecoEntity(long id, String nomeRua, int numeroCasa, String nomeBairro, String nomeCidade) {
		this.id = id;
		this.nomeRua = nomeRua;
		this.numeroCasa = numeroCasa;
		this.nomeBairro = nomeBairro;
		this.nomeCidade = nomeCidade;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeRua() {
		return nomeRua;
	}
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}
	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getNomeBairro() {
		return nomeBairro;
	}
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	
	
}
