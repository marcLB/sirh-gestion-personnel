package dev.sgp.entite;

public class VisiteWeb {
	private int id;
	private String chemin;
	private String tempsExecution;
	
//CONSTRUCT
	public VisiteWeb(int id, String chemin, String tempsExecution) {
		super();
		this.id = id;
		this.chemin = chemin;
		this.tempsExecution = tempsExecution;
	}
	
	
	
	
//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChemin() {
		return chemin;
	}
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}
	public String getTempsExecution() {
		return tempsExecution;
	}
	public void setTempsExecution(String tempsExecution) {
		this.tempsExecution = tempsExecution;
	}
}
