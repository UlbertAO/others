package com.vyntra.vyntrau.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class products {
	
	@Id
	@GeneratedValue
	@NotNull
	private int pid;
	@NotNull
	private String pname;
	@NotNull
	private String pdesc;
	@NotNull
	private float price;
	@NotNull
	private String pdate;
	@NotNull
	private String manfid;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public String getManfid() {
		return manfid;
	}
	public void setManfid(String manfid) {
		this.manfid = manfid;
	}
	
	
	

}
