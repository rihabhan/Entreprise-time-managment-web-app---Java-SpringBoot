package com.enit.ProjectSpring11.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@Column(name = "num_dept")
	private int numDept;
    @Column(name = "nom")
    private String nom;
    @OneToOne
    @JoinColumn(name="num_agendadept")
    private AgendaDept agendadeptt;
	public int getNumDept() {
		return numDept;
	}
	public AgendaDept getAgendadeptt() {
		return agendadeptt;
	}
	public void setAgendadeptt(AgendaDept agendadeptt) {
		this.agendadeptt = agendadeptt;
	}
	@Override
	public String toString() {
		return "Department [numDept=" + numDept + ", nom=" + nom + "]";
	}
	public void setNumDept(int num) {
		this.numDept = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
