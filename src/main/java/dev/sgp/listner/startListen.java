package dev.sgp.listner;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.stream.Stream;
import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;

@WebListener
public class startListen implements ServletContextListener {

	@Inject
	private CollaborateurService collabService;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ZonedDateTime dateHeureCreation = ZonedDateTime.now();

		Stream.of(
				new Collaborateur("1", "Marc", "LB", LocalDate.parse("1520-05-25"), "12", "521452121212121", "ee.ss@societe.com","img.png" ,dateHeureCreation , true),
				new Collaborateur("2", "est", "rr", LocalDate.parse("1993-06-25"), "14", "121212121212121", "ee.ss@societe.com","img.png" ,dateHeureCreation , true),
				new Collaborateur("3", "pmp", "cdr", LocalDate.parse("1993-06-25"), "14", "121212121212121", "ee.ss@societe.com","img.png" ,dateHeureCreation , true),
				new Collaborateur("4", "sar", "vif", LocalDate.parse("1993-06-25"), "14", "121212121212121", "ee.ss@societe.com","img.png" ,dateHeureCreation , true),
				new Collaborateur("5", "pop", "youpi", LocalDate.parse("1993-06-25"), "14", "121212121212121", "ee.ss@societe.com","img.png" ,dateHeureCreation , true)
				)
		.forEach(collab -> collabService.sauvegarderCollaborateur(collab));


	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}
