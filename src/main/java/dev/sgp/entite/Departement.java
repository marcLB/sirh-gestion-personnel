package dev.sgp.entite;



import javax.persistence.*;

@Entity
@Table(name="Departement")
public class Departement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="nom")
	private String nom;
	
	
	public Departement() {}
	
	public Departement(String nom) {
		super();
		this.nom = nom;
	}
	

	
//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
