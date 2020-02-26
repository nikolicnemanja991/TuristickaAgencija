package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUser;
	private String userName;
	private String password;
	private Double balance = 0.0;
	@Enumerated
	private Rola rola;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Putnik> sviPutnici = new ArrayList<>();
	
	
	public List<Putnik> getSviPutnici() {
		return sviPutnici;
	}
	public void setSviPutnici(List<Putnik> sviPutnici) {
		this.sviPutnici = sviPutnici;
	}
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Rola getRola() {
		return rola;
	}
	public void setRola(Rola rola) {
		this.rola = rola;
	}
	
	
}
