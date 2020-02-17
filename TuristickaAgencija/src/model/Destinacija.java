package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Destinacija {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDestinacija;
	private String drzava;
	private String mesto;
	private String smestaj;
	private Double cenaSmestaja;
	private Integer brojDana;
	private Date datumPolaska;
	
	private Double popust;
	
	public Integer getIdDestinacija() {
		return idDestinacija;
	}
	public void setIdDestinacija(Integer idDestinacija) {
		this.idDestinacija = idDestinacija;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
	public String getMesto() {
		return mesto;
	}
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	public String getSmestaj() {
		return smestaj;
	}
	public void setSmestaj(String smestaj) {
		this.smestaj = smestaj;
	}
	public Double getCenaSmestaja() {
		return cenaSmestaja;
	}
	public void setCenaSmestaja(Double cenaSmestaja) {
		this.cenaSmestaja = cenaSmestaja;
	}
	public Integer getBrojDana() {
		return brojDana;
	}
	public void setBrojDana(Integer brojDana) {
		this.brojDana = brojDana;
	}
	public Date getDatumPolaska() {
		return datumPolaska;
	}
	public void setDatumPolaska(Date datumPolaska) {
		this.datumPolaska = datumPolaska;
	}
	public Double getPopust() {
		return popust;
	}
	public void setPopust(Double popust) {
		this.popust = popust;
	}
	
	

}
