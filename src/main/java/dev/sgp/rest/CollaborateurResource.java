package dev.sgp.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;

@Path("/collaborateurs")
public class CollaborateurResource {

@Inject private CollaborateurService collabService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Collaborateur> list() {
		return collabService.listerCollaborateurs();
	}
	
	
	@GET
	@Path("/{matricule}")
	@Produces(MediaType.APPLICATION_JSON)
	public Collaborateur getCollabById(@DefaultValue("1") @PathParam("matricule") Integer matricule){
		return collabService.getCollabById(matricule);
	}
	
	
}
