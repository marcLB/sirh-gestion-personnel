package dev.sgp.listener;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.stream.Stream;
import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.CoordonneesBancaire;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.CoordonneesBancaireService;
import dev.sgp.service.DepartementService;

@WebListener
public class startListen implements ServletContextListener {

	@Inject
	private CollaborateurService collabService; 
	@Inject
	private DepartementService depService; 
	@Inject 
	private CoordonneesBancaireService coordBanqueService; 
	
	
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ZonedDateTime dateHeureCreation = ZonedDateTime.now();
		
		CoordonneesBancaire coordBanque=new CoordonneesBancaire("credit agricole", "azertyui", "dfghjk");
		
		Departement ca = new Departement("Comptabilitée");
		Departement kb = new Departement("Kreizh Breizh");
	
		
		
		Stream.of(
				ca,
				kb
				)
		.forEach(dep -> depService.sauvegarderDepartement(dep));
		Stream.of(
				new Collaborateur("1", "Marc", "LB", LocalDate.parse("1520-05-25"), "12", "521452121212121", "ee.ss@societe.com","img.png" ,dateHeureCreation , true,ca),
				new Collaborateur("2", "est", "rr", LocalDate.parse("1993-06-25"), "14", "121212121212121", "ee.ss@societe.com","img.png" ,dateHeureCreation , true,kb),
				new Collaborateur("3", "pom", "dapi", LocalDate.parse("1993-06-25"), "14", "121212121212121", "ee.ss@societe.com","img.png" ,dateHeureCreation , true,kb),
				new Collaborateur("4", "sar", "vif", LocalDate.parse("1993-06-25"), "14", "121212121212121", "ee.ss@societe.com","img.png" ,dateHeureCreation , true,ca),
				new Collaborateur("5", "pop", "youpi", LocalDate.parse("1993-06-25"), "14", "121212121212121", "ee.ss@societe.com","img.png" ,dateHeureCreation , true,ca)
				)
		.forEach(collab -> collabService.sauvegarderCollaborateur(collab));
		

		

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}
