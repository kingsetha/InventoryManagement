package com.sample.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Dealer")
public class Dealer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
	
	@Column
	private String name;
	
	@Column
	private String rtype;
	
	@Column
	private String product;
	

	public Dealer() {
		super();
		
	}


	public Dealer(int rid, String name, String rtype, String product) {
		super();
		this.rid = rid;
		this.name = name;
		this.rtype = rtype;
		this.product = product;
	}


	@Override
	public String toString() {
		return "Repair [rid=" + rid + ", name=" + name + ", rtype=" + rtype + ", product=" + product + "]";
	}


	public int getRid() {
		return rid;
	}


	public void setRid(int rid) {
		this.rid = rid;
	}


	public String getname() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
	}


	public String getRtype() {
		return rtype;
	}


	public void setRtype(String rtype) {
		this.rtype = rtype;
	}


	public String getproduct() {
		return product;
	}


	public void setproduct(String product) {
		this.product = product;
	}

	

}
