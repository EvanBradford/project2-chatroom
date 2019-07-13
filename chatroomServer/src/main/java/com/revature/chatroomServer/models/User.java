package com.revature.chatroomServer.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "AE_USERS")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2256157303344337210L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ae_userid_gen")
	@SequenceGenerator(name = "ae_userid_gen", sequenceName = "AE_user_seq", allocationSize = 1)
	@Column(name = "AEID")
	private Integer AEID;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ADMINLVL")
	private Integer adminLvl;
	
	@Column(name = "STATUS")
	private Integer status;

	public Integer getAEID() {
		return AEID;
	}

	public void setAEID(Integer aEID) {
		AEID = aEID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAdminLvl() {
		return adminLvl;
	}

	public void setAdminLvl(Integer adminLvl) {
		this.adminLvl = adminLvl;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AEID == null) ? 0 : AEID.hashCode());
		result = prime * result + ((adminLvl == null) ? 0 : adminLvl.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (AEID == null) {
			if (other.AEID != null)
				return false;
		} else if (!AEID.equals(other.AEID))
			return false;
		if (adminLvl == null) {
			if (other.adminLvl != null)
				return false;
		} else if (!adminLvl.equals(other.adminLvl))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [AEID=" + AEID + ", email=" + email + ", password=" + password + ", adminLvl=" + adminLvl
				+ ", status=" + status + "]";
	}

	public User(Integer aEID, String email, String password, Integer adminLvl, Integer status) {
		super();
		AEID = aEID;
		this.email = email;
		this.password = password;
		this.adminLvl = adminLvl;
		this.status = status;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



}
