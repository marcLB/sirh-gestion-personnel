package dev.sgp.entite;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.ZonedDateTime;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CollabEvt {
	private ZonedDateTime dateHeure;
	private TypeCollabEvt type;
	private String matricule;
	
	public CollabEvt(ZonedDateTime dateHeure, TypeCollabEvt type, String matricule) {
			super();
			this.dateHeure = dateHeure;
			this.type = type;
			this.matricule = matricule;
		}




//GETTERS AND SETTERS
	public String getDateHeure() {
		String jour = dateHeure.getDayOfWeek().toString(); 
		String mois = dateHeure.getMonth().toString(); 
		int annee = dateHeure.getYear(); 
		
		return jour+" "+mois+" "+annee;
	}
	public void setDateHeure(ZonedDateTime dateHeure) {
		this.dateHeure = dateHeure;
	}
	public TypeCollabEvt getType() {
		return type;
	}
	public String getTypeString() {
		return type.toString();
	}
	
	public void setType(TypeCollabEvt type) {
		this.type = type;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
}
