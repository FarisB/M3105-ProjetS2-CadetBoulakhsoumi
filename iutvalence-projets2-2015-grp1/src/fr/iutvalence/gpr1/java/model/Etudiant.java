package fr.iutvalence.gpr1.java.model;

/** Classe Etudiant. */
public class Etudiant extends Personne {

	public static final int NBR_ABSENCE_BY_DEFAULT = 0;

	private String gprTP;
	
	private int grpTd;

	private int numEtudiant;

	private boolean absence;

	private int nbrAbsence;


	public Etudiant(String nom, String prenom, String gprTP, int grpTD, int numEtudiant, String login, String password) {
		super(nom, prenom, login, password);
		this.gprTP = gprTP;
		this.grpTd = grpTD;
		this.numEtudiant = numEtudiant;
		this.absence = true;
		this.nbrAbsence = NBR_ABSENCE_BY_DEFAULT;
	}


	public int getGrpTd() {
		return grpTd;
	}


	public String getgprTP() {
		return this.gprTP;
	}


	public int getnumEtudiant() {
		return this.numEtudiant;
	}


	public int getNbrAbsence() {
		return this.nbrAbsence;
	}


	public boolean estAbsent() {
		return this.absence;
	}

	
	public void setAbsence(boolean absence) {
		this.absence = absence;
	}

	public void addAbsence() {
		this.nbrAbsence = this.nbrAbsence++;
	}
	

	public String toString(){
		return this.nom+","+this.prenom+","+this.gprTP+","+this.numEtudiant+ "/";
	}

}
