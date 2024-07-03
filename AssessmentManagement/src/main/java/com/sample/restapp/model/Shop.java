package com.sample.restapp.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Shop")
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@Column
	private String cname;
	@Column
	private String location;
	@Column
	private String address;
	@OneToOne(targetEntity=Dealer.class,cascade=CascadeType.ALL)
	@JoinColumn(name="rid")
	private Dealer dealer;
	public Shop() {
		super();
		
	}
	public Shop(int cid, String cname, String location, String address, Dealer dealer) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.location = location;
		this.address = address;
		this.dealer = dealer;
	}
	@Override
	public String toString() {
		return "Mobile [cid=" + cid + ", cname=" + cname + ", location=" + location + ", address=" + address
				+ ", dealer=" + dealer + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Dealer getRepair() {
		return dealer;
	}
	public void setRepair(Dealer dealer) {
		this.dealer = dealer;
	}
	
	

}
