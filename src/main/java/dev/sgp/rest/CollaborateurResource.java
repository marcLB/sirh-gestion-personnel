package dev.sgp.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;

@Path("/collaborateurs")
public class CollaborateurResource {

@Inject private CollaborateurService collabService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Collaborateur> get(@QueryParam("departement") int id_departement) {
		if(id_departement>-1){
			return getCollabWhithIdDep(id_departement);
		} else { 
			return list();
		}
	}
	
	public List<Collaborateur> list() {
		return collabService.listerCollaborateurs();
	}
	
	public List<Collaborateur> getCollabWhithIdDep(@DefaultValue("1") @PathParam("id_departement") Integer id_departement){
		return collabService.getCollabWhithIdDep(id_departement);
	}
	
	
	@Path("/{matricule}")
	@Produces(MediaType.APPLICATION_JSON)
	public Collaborateur getCollabById(@DefaultValue("1") @PathParam("matricule") Integer matricule){
		return collabService.getCollabById(matricule);
	}
	
}
