package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.VisiteWeb;

public class StatistiqueController extends HttpServlet {
	private String ROUTE = "/WEB-INF/views/collab/statistiqueCollaborateurs.jsp";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws 
	ServletException, IOException {
		List<VisiteWeb> listeVisiteWeb=new ArrayList<>();
		listeVisiteWeb.add(new VisiteWeb(1,"https://ffefefef","12 secondes"));
		req.setAttribute("listeStats",listeVisiteWeb);

		
		
		req.getRequestDispatcher( ROUTE )
		.forward(req, resp);
	}
}
