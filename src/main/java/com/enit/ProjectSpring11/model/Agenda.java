package com.enit.ProjectSpring11.model;

import java.util.Date;
import java.util.List;

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
@Table(name = "agenda")
public class Agenda {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name = "num_agenda")
	    private int numAgenda;

	    @Column(name = "date_creation")
	    private Date dateCreation;

	    public int getNumAgenda() {
			return numAgenda;
		}
		@Override
		public String toString() {
			return "Agenda [numAgenda=" + numAgenda + ", dateCreation=" + dateCreation + ", numemployee=" + numemployee
					+ "]";
		}
		public void setNumAgenda(int numAgenda) {
			this.numAgenda = numAgenda;
		}
		public Date getDateCreation() {
			return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}
		public Employee getEmployee() {
			return numemployee;
		}
		public void setEmployee(Employee employee) {
			this.numemployee = employee;
		}
	    public Employee getNumemployee() {
			return numemployee;
		}
		public void setNumemployee(Employee numemployee) {
			this.numemployee = numemployee;
		}
		public List<Activities> getActivities() {
			return activities;
		}
		public void setActivities(List<Activities> activities) {
			this.activities = activities;
		}
		@OneToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "num_employe")
	    private Employee numemployee;
	    public Agenda(int numAgenda, Date dateCreation, Employee numemployee) {
			super();
			this.numAgenda = numAgenda;
			this.dateCreation = dateCreation;
			this.numemployee = numemployee;
		}
		@OneToMany(mappedBy = "agenda")
	    private List<Activities> activities;

		public Agenda(int numAgenda) {
			super();
			this.numAgenda = numAgenda;
		}
		public Agenda() {
			super();
		}

}
