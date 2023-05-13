package com.enit.ProjectSpring11.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employe")
public class Employee {
	    @Id
	    //@GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name = "numEmploye")
	    private int numEmploye;
	    @Column(name = "nom")
		private String nom;
	    @Column(name = "prenom")
		private String prenom;
	    @Column(name = "telIntern")
		private String telIntern;
	    @Column(name = "email")
		private String email;
	    @Column(name = "niveau")
		private int niveau;
		@ManyToOne
		@JoinColumn(name="num_dept")
		private Department department;
	   public int getNumEmploye() {
		return numEmploye;
	}
	public void setNumEmploye(int numEmploye) {
		this.numEmploye = numEmploye;
	}
	@Override
	public String toString() {
		return "Employee [numEmploye=" + numEmploye + ", nom=" + nom + ", prenom=" + prenom + ", telIntern=" + telIntern
				+ ", email=" + email + ", niveau=" + niveau + ", department=" + department + "]";
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	

}
