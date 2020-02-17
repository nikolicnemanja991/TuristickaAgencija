package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Transakcije {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTransakcije;
	@OneToOne
	private Racun racun;
	private Date datum;
	public Integer getIdTransakcije() {
		return idTransakcije;
	}
	public void setIdTransakcije(Integer idTransakcije) {
		this.idTransakcije = idTransakcije;
	}
	public Racun getRacun() {
		return racun;
	}
	public void setRacun(Racun racun) {
		this.racun = racun;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	
	
	
	

}
