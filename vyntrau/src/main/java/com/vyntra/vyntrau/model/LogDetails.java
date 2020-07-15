package com.vyntra.vyntrau.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class LogDetails {

	@Id
	@Column(name="id")
	private int uid;
	@Column(name="lastLogin")
	@NotNull
	private String lastLogin;
	@Column(name="lastLogout")
	@NotNull
	private String lastLogout;
	@Column(name="isInvalid")
	@NotNull
	private boolean isInvalid;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getLastLogout() {
		return lastLogout;
	}
	public void setLastLogout(String lastLogout) {
		this.lastLogout = lastLogout;
	}
	public boolean isInvalid() {
		return isInvalid;
	}
	public void setInvalid(boolean isInvalid) {
		this.isInvalid = isInvalid;
	}
	
	
	

}
