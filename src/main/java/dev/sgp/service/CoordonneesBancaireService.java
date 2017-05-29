package dev.sgp.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.CoordonneesBancaire;
import dev.sgp.entite.Departement;


@Stateless
public class CoordonneesBancaireService {
	@PersistenceContext(unitName="sgp-pu") private EntityManager em;
	
	
	public List<CoordonneesBancaire> listerDepartement() {		
		TypedQuery<CoordonneesBancaire> query = em.createQuery("SELECT c FROM CoordonneesBancaire c", CoordonneesBancaire.class);
		List<CoordonneesBancaire> listeDepartement= query.getResultList();
		return listeDepartement;
	}
	
	
	public Object sauvegarderCoordonneesBancaire(CoordonneesBancaire coord) {
		em.persist(coord);
		return null;
	}

}
