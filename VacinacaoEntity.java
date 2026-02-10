package com.petShop.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VacinacaoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long codigoVacinacao;
	private LocalDate validadeVacinacao;
	private int periodoVacinacao;
	
	public VacinacaoEntity() {
		
	}

    public VacinacaoEntity(long id, long codigoVacinacao, LocalDate validadeVacinacao, int periodoVacinacao) {
		this.id = id;
		this.codigoVacinacao = codigoVacinacao;
		this.validadeVacinacao = validadeVacinacao;
		this.periodoVacinacao = periodoVacinacao;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCodigoVacinacao() {
		return codigoVacinacao;
	}
	public void setCodigoVacinacao(long codigoVacinacao) {
		this.codigoVacinacao = codigoVacinacao;
	}
	public LocalDate getValidadeVacinacao() {
		return validadeVacinacao;
	}
	public void setValidadeVacinacao(LocalDate validadeVacinacao) {
		this.validadeVacinacao = validadeVacinacao;
	}
	public int getPeriodoVacinacao() {
		return periodoVacinacao;
	}
	public void setPeriodoVacinacao(int periodoVacinacao) {
		this.periodoVacinacao = periodoVacinacao;
	}
	
	
}
