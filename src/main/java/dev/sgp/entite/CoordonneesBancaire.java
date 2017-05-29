package dev.sgp.entite;

import javax.persistence.*;

@Entity
@Table(name="CoordonneesBancaire")
public class CoordonneesBancaire {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private int id;
	@Column(name="banque")
	private String banque;
	@Column(name="bic")
	private String bic;
	@Column(name="iban")
	private String iban;
		
	//CONSTRUCTORS
	public CoordonneesBancaire() { }
	
	
	public CoordonneesBancaire(String banque, String bic, String iban) {
			super();
			this.banque = banque;
			this.bic = bic;
			this.iban = iban;
		}
	
	//**************
	
	//GETTERS AND SETTERS
		
	
	public String getBanque() {
		return banque;
	}
	
	public void setBanque(String banque) {
		this.banque = banque;
	}
	
	public String getBic() {
		return bic;
	}
	
	public void setBic(String bic) {
		this.bic = bic;
	}
	
	public String getIban() {
		return iban;
	}
	
	public void setIban(String iban) {
		this.iban = iban;
	}
}
