package com.enit.ProjectSpring11.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "num_dept")
	private int numDept;
    @Column(name = "nom")
    private String nom;
	@OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "chef_id")
    private Employee chef;
    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name="num_agendadept")
    private AgendaDept agendadeptt;
	@OneToMany(mappedBy = "department")
    private List<Employee> employees;
    
    public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Employee getChef() {
		return chef;
	}
	public void setChef(Employee chef) {
		this.chef = chef;
	}

    
    public Department(int numDept, String nom, Employee chef, AgendaDept agendadeptt, List<Employee> employees) {
		super();
		this.numDept = numDept;
		this.nom = nom;
		this.chef = chef;
		this.agendadeptt = agendadeptt;
		this.employees = employees;
	}
	public Department(int numDept) {
		super();
		this.numDept = numDept;
	}
	public Department() {
		super();
	}

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
		return "Department [numDept=" + numDept + ", nom=" + nom + ", employees=" + employees + ", chef=" + chef
				+ ", agendadeptt=" + agendadeptt + "]";
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
