package com.enit.ProjectSpring11.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "agendadept")
public class AgendaDept {
	@Id
	@Column(name = "num_agendadept")
    private int numAgendaDept;
	@Column(name = "datemaj")
    private Date dateMAJ;
	@Override
	public String toString() {
		return "AgendaDept [numAgendaDept=" + numAgendaDept + ", dateMAJ=" + dateMAJ + "]";
	}
	public int getNumAgendaDept() {
		return numAgendaDept;
	}
	public void setNumAgendaDept(int numAgendaDept) {
		this.numAgendaDept = numAgendaDept;
	}
	public Date getDateMAJ() {
		return dateMAJ;
	}
	public void setDateMAJ(Date dateMAJ) {
		this.dateMAJ = dateMAJ;
	}

}
