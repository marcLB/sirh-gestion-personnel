package dev.sgp.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.Departement;


@Stateless
public class DepartementService {
	@PersistenceContext(unitName="sgp-pu") private EntityManager em;
	
	public List<Departement> listerDepartement() {		
		TypedQuery<Departement> query = em.createQuery("SELECT p FROM Departement p", Departement.class);
		List<Departement> listeDepartement= query.getResultList();
		return listeDepartement;
	}

	public void sauvegarderDepartement(Departement dep) {
		em.persist(dep);
	}
}
