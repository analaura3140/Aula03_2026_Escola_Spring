package com.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChipEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long codigoChip;
	private String localChip;
	private String statusChip;
	
	public ChipEntity() {
		
	}
	
    public ChipEntity(long id, long codigoChip, String localChip, String statusChip) {
    	this.id = id;
    	this.codigoChip = codigoChip;
    	this.localChip = localChip;
    	this.statusChip = statusChip;
	}  

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCodigoChip() {
		return codigoChip;
	}
	public void setCodigoChip(long codigoChip) {
		this.codigoChip = codigoChip;
	}
	public String getLocalChip() {
		return localChip;
	}
	public void setLocalChip(String localChip) {
		this.localChip = localChip;
	}
	public String getStatusChip() {
		return statusChip;
	}
	public void setStatusChip(String statusChip) {
		this.statusChip = statusChip;
	}
	
	
}
