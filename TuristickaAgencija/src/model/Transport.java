package model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Transport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTransport;
	@Enumerated
	private TipTransporta tipTransporta;
	private Double cena;
	@OneToOne
	private Destinacija destinacija;
	
	private Double popust;
	
	public Integer getIdTransport() {
		return idTransport;
	}
	public void setIdTransport(Integer idTransport) {
		this.idTransport = idTransport;
	}
	public TipTransporta getTipTransporta() {
		return tipTransporta;
	}
	public void setTipTransporta(TipTransporta tipTransporta) {
		this.tipTransporta = tipTransporta;
	}
	public Double getCena() {
		return cena;
	}
	public void setCena(Double cena) {
		this.cena = cena;
	}
	public Destinacija getDestinacija() {
		return destinacija;
	}
	public void setDestinacija(Destinacija destinacija) {
		this.destinacija = destinacija;
	}
	public Double getPopust() {
		return popust;
	}
	public void setPopust(Double popust) {
		this.popust = popust;
	}
	
	
	
	

}
