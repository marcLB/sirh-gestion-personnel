package dev.sgp.service;

import java.time.ZonedDateTime;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.CollabEvt;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.TypeCollabEvt;

@Stateless
public class CollaborateurService {
	@PersistenceContext(unitName="sgp-pu") private EntityManager em;
	@Inject Event<CollabEvt> collabEvt;
	
	
	public List<Collaborateur> listerCollaborateurs() {		
		TypedQuery<Collaborateur> query = em.createQuery("SELECT p FROM Collaborateur p", Collaborateur.class);
		List<Collaborateur> listeCollaborateurs = query.getResultList();
		return listeCollaborateurs;
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		collab.setDateHeureCreation(ZonedDateTime.now());
		collab.setActif(true);
		em.persist(collab);
		CollabEvt nouveauCollabEvt = new CollabEvt(collab.getDateHeureCreation(),TypeCollabEvt.CREATION_COLLAB,collab.getMatricule());
		collabEvt.fire(nouveauCollabEvt);
	}

	public Collaborateur getCollabById(int matricule) {
		TypedQuery<Collaborateur> query = em.createQuery( "Select c " + "from Collaborateur c " + "Where c.matricule="+matricule,Collaborateur.class );
		Collaborateur collab = query.getSingleResult();
		return collab;
	}

	public List<Collaborateur> getCollabWhithIdDep(Integer id_departement) {		
		TypedQuery<Collaborateur> query = em.createQuery( "Select c " + "from Collaborateur c " + "Where c.departement.id="+id_departement,Collaborateur.class );
		List<Collaborateur> collab = query.getResultList();
		return collab;
	}

}
