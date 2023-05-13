package com.enit.ProjectSpring11.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "activitiesdept")
public class ActivitiesDept {
	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_act")
    private int numAct;

    @Column(name = "typed")
    private String typeD;

    @Column(name = "descript")
    private String descript;

    @Column(name = "date_act")
    private Date dateAct;

    @Column(name = "h_debut")
    private Date hDebut;

    @Column(name = "h_fin")
    private Date hFin;

    @Column(name = "date_creation")
    private Date dateCreation;

    @Override
	public String toString() {
		return "ActivitiesDept [numAct=" + numAct + ", typeD=" + typeD + ", descript=" + descript + ", dateAct="
				+ dateAct + ", hDebut=" + hDebut + ", hFin=" + hFin + ", dateCreation=" + dateCreation + ", createur="
				+ createur + ", agenda=" + agenda + "]";
	}

	public int getNumAct() {
		return numAct;
	}

	public void setNumAct(int numAct) {
		this.numAct = numAct;
	}

	public String getTypeD() {
		return typeD;
	}

	public void setTypeD(String typeD) {
		this.typeD = typeD;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public Date getDateAct() {
		return dateAct;
	}

	public void setDateAct(Date dateAct) {
		this.dateAct = dateAct;
	}

	public Date gethDebut() {
		return hDebut;
	}

	public void sethDebut(Date hDebut) {
		this.hDebut = hDebut;
	}

	public Date gethFin() {
		return hFin;
	}

	public void sethFin(Date hFin) {
		this.hFin = hFin;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getCreateur() {
		return createur;
	}

	public void setCreateur(String createur) {
		this.createur = createur;
	}

	public AgendaDept getAgenda() {
		return agenda;
	}

	public void setAgenda(AgendaDept agenda) {
		this.agenda = agenda;
	}

	@Column(name = "createur")
    private String createur;

    @ManyToOne
    @JoinColumn(name = "num_agendadept")
    private AgendaDept agenda;

}
