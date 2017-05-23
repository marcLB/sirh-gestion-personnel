package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class AjouterCollaborateurController extends HttpServlet {
	public static final String VUE = "/WEB-INF/views/collab/ajouterCollaborateurs.jsp";
	public static final String CHAMP_NOM = "nom";
	public static final String CHAMP_PRENOM = "prenom";
	public static final String CHAMP_DATE_DE_NAISSANCE= "dateDeNaissance";
	public static final String CHAMP_ADRESSE = "adresse";
	public static final String CHAMP_NUMERO_SECU = "numSecu";
	
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
	    this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse resp ) throws ServletException, IOException{
	    /* Récupération des champs du formulaire. */
		resp.setCharacterEncoding("utf-8");
		String nom = request.getParameter( CHAMP_NOM );
	    String prenom = request.getParameter( CHAMP_PRENOM );
	    String dateDeNaissance = request.getParameter( CHAMP_DATE_DE_NAISSANCE );
	    String adresse = request.getParameter( CHAMP_ADRESSE );
	    String numSecu = request.getParameter( CHAMP_NUMERO_SECU );
	
	    Map<Boolean, List<String>> validationParams = validerParametres(request, "nom","prenom", "dateDeNaissance", "adresse", "numSecu");
	    		
		
		if (validationParams.get(false) != null) {
			resp.setStatus(400);
			resp.getWriter().write("Les paramètres suivants sont incorrects : " + validationParams.get(false).stream().collect(Collectors.joining(",")));
			
		}
		else if(numSecu.length() != 15) {
			resp.setStatus(400);
			resp.getWriter().write("Numéro de sécurité sociale incorrecte");
		}
		else {
			
			resp.setStatus(201);
			
			Collaborateur collab = new Collaborateur(nom, prenom, LocalDate.parse(dateDeNaissance), adresse, numSecu);
			this.collabService.sauvegarderCollaborateur(collab);
			
			resp.sendRedirect(request.getContextPath() + "/collaborateurs/lister");
		}
	}
	
	private Map<Boolean, List<String>> validerParametres(HttpServletRequest req, String... params) {
		return Stream.of(params).collect(
				Collectors.groupingBy(
						param -> req.getParameter(param) != null && !"".equals(req.getParameter(param)
				)));
	}
}