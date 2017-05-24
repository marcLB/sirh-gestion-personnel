package dev.sgp.service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.sgp.entite.Collaborateur;


@ApplicationScoped
public class CollaborateurService {
	
	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	
	
	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}
	
	public void sauvegarderCollaborateur(Collaborateur collab) {
		
		collab.setDateHeureCreation(ZonedDateTime.now());
		collab.setActif(true);
		listeCollaborateurs.add(collab);
	}
}
