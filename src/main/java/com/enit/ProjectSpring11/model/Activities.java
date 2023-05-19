package com.enit.ProjectSpring11.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "activities")
public class Activities {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_activite")
    private int numActivite;

    @Column(name = "type_a")
    private String typeA;

    @Column(name = "description")
    private String description;

    @Column(name = "date_act")
    private Date dateAct;

    public int getNumActivite() {
		return numActivite;
	}

	@Override
	public String toString() {
		return "Activities [numActivite=" + numActivite + ", typeA=" + typeA + ", description=" + description
				+ ", dateAct=" + dateAct + ", hDebut=" + hDebut + ", hFin=" + hFin + ", dateCreation=" + dateCreation
				+ ", createur=" + createur + ", visible=" + visible + ", agenda=" + agenda + ", alerts=" + alerts + "]";
	}

	public void setNumActivite(int numActivite) {
		this.numActivite = numActivite;
	}

	public String getTypeA() {
		return typeA;
	}

	public void setTypeA(String typeA) {
		this.typeA = typeA;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public int getVisible() {
		return visible;
	}

	public void setVisible(int visible) {
		this.visible = visible;
	}

	@Column(name = "h_debut")
    private Date hDebut;

    @Column(name = "h_fin")
    private Date hFin;

    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name = "createur", length = 20)
    private String createur;

    @Column(name = "visible")
    private int visible;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "num_agenda")
    private Agenda agenda;
    @OneToMany(mappedBy = "activity", cascade = CascadeType.ALL)
    private List<Alert> alerts;

	public Activities() {
		super();
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public List<Alert> getAlerts() {
		return alerts;
	}

	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}

	public Activities(int numActivite) {
		super();
		this.numActivite = numActivite;
	}

	public Activities(int numActivite, String typeA, String description, Date dateAct, Date hDebut, Date hFin,
			Date dateCreation, String createur, int visible, Agenda agenda, List<Alert> alerts) {
		super();
		this.numActivite = numActivite;
		this.typeA = typeA;
		this.description = description;
		this.dateAct = dateAct;
		this.hDebut = hDebut;
		this.hFin = hFin;
		this.dateCreation = dateCreation;
		this.createur = createur;
		this.visible = visible;
		this.agenda = agenda;
		this.alerts = alerts;
	}

}
