package com.enit.ProjectSpring.model;

public class Employee {
	   private int numEmploye;
	   public int getNumEmploye() {
		return numEmploye;
	}
	public void setNumEmploye(int numEmploye) {
		this.numEmploye = numEmploye;
	}
	@Override
	public String toString() {
		return "Employee [numEmploye=" + numEmploye + ", nom=" + nom + ", prenom=" + prenom + ", telIntern=" + telIntern
				+ ", email=" + email + ", niveau=" + niveau + "]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelIntern() {
		return telIntern;
	}
	public void setTelIntern(String telIntern) {
		this.telIntern = telIntern;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	private String nom;
	private String prenom;
	private String telIntern;
	private String email;
	private int niveau;

}
