package com.enit.ProjectSpring11.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "processverbal")
public class ProcessVerbal {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "num_procesv")
	private int NumProcesV;
    public int getNumProcesV() {
		return NumProcesV;
	}
	public void setNumProcesV(int numProcesV) {
		NumProcesV = numProcesV;
	}
	@Override
	public String toString() {
		return "ProcessVerbal [NumProcesV=" + NumProcesV + ", resum=" + resum + "]";
	}
	public String getResum() {
		return resum;
	}
	public void setResum(String resum) {
		this.resum = resum;
	}
	@Column(name = "resum")
	private String  resum;
	public ProcessVerbal(int numProcesV) {
		super();
		NumProcesV = numProcesV;
	}
	public ProcessVerbal() {
		super();
	}
	public ProcessVerbal(int numProcesV, String resum) {
		super();
		NumProcesV = numProcesV;
		this.resum = resum;
	}
}
