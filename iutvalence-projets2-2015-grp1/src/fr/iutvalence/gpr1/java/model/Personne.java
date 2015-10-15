package fr.iutvalence.gpr1.java.model;

/** Classe Personne. */
public class Personne {
	protected String nom;
	protected String prenom;
	protected String login;
	protected String password;


	public Personne(String nom, String prenom, String login, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}


	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}


	public String getLogin() {
		return this.login;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPassword() {
		return this.password;
	}

}