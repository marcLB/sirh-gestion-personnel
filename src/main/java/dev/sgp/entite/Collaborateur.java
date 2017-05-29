package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.*;


@Entity
@Table(name="Collaborateur")
public class Collaborateur {
		
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private int id;
    
    
	@Column(name="matricule")
	private String matricule;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="dateDeNaissance")
	private LocalDate dateDeNaissance;
	@Column(name="adresse")
	private String adresse;
	@Column(name="numSecu")
	private String numSecu;
	@Column(name="email")
	private String email;
	@Column(name="photo")
	private String photo;
	@Column(name="dateHeureCreation")
	private ZonedDateTime dateHeureCreation;
	@Column(name="actif")
	private Boolean actif;
	
	
	@ManyToOne
	private Departement departement;
	
	
	

	public Collaborateur() {}
	
	public Collaborateur(String matricule, String nom, String prenom, LocalDate dateDeNaissance, String adresse,
			String numSecu, String email, String photo) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numSecu = numSecu;
		this.email = email;
		this.photo = photo;
	}

	
	public Collaborateur(String matricule, String nom, String prenom, LocalDate dateDeNaissance,
			String adresse, String numSecu, String email, String photo, ZonedDateTime dateHeureCreation,
			Boolean actif, Departement departement) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numSecu = numSecu;
		this.email = email;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
		this.departement= departement;
	}
	
	
	
	
	
	
//GETTERS AND SETTERS
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumSecu() {
		return numSecu;
	}
	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
}
