package com.enit.ProjectSpring11.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "alertes")
public class Alert {
	@Id
    @Column(name = "type")
    private String type;

    @Column(name = "delais")
    private Date delais;

	@Override
	public String toString() {
		return "Alert [type=" + type + ", delais=" + delais + ", activity=" + activity + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDelais() {
		return delais;
	}

	public void setDelais(Date delais) {
		this.delais = delais;
	}
    public Activities getActivity() {
		return activity;
	}

	public void setActivity(Activities activity) {
		this.activity = activity;
	}
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "num_activite")
    private Activities activity;

	public Alert(String type) {
		super();
		this.type = type;
	}

	public Alert(String type, Date delais, Activities activity) {
		super();
		this.type = type;
		this.delais = delais;
		this.activity = activity;
	}

	public Alert() {
		super();
	}
}
