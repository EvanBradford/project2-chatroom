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
	private String EMAIL;

	@Column(name = "PASSWORD")
	private String PASSWORD;

	@Column(name = "ADMINLVL")
	private Integer ADMINLVL;
	
	@Column(name = "STATUS")
	private Integer STATUS;

	public Integer getAEID() {
		return AEID;
	}

	public void setAEID(Integer aEID) {
		AEID = aEID;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public Integer getADMINLVL() {
		return ADMINLVL;
	}

	public void setADMINLVL(Integer aDMINLVL) {
		ADMINLVL = aDMINLVL;
	}

	public Integer getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(Integer sTATUS) {
		STATUS = sTATUS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ADMINLVL == null) ? 0 : ADMINLVL.hashCode());
		result = prime * result + ((AEID == null) ? 0 : AEID.hashCode());
		result = prime * result + ((EMAIL == null) ? 0 : EMAIL.hashCode());
		result = prime * result + ((PASSWORD == null) ? 0 : PASSWORD.hashCode());
		result = prime * result + ((STATUS == null) ? 0 : STATUS.hashCode());
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
		if (ADMINLVL == null) {
			if (other.ADMINLVL != null)
				return false;
		} else if (!ADMINLVL.equals(other.ADMINLVL))
			return false;
		if (AEID == null) {
			if (other.AEID != null)
				return false;
		} else if (!AEID.equals(other.AEID))
			return false;
		if (EMAIL == null) {
			if (other.EMAIL != null)
				return false;
		} else if (!EMAIL.equals(other.EMAIL))
			return false;
		if (PASSWORD == null) {
			if (other.PASSWORD != null)
				return false;
		} else if (!PASSWORD.equals(other.PASSWORD))
			return false;
		if (STATUS == null) {
			if (other.STATUS != null)
				return false;
		} else if (!STATUS.equals(other.STATUS))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [AEID=" + AEID + ", EMAIL=" + EMAIL + ", PASSWORD=" + PASSWORD + ", ADMINLVL=" + ADMINLVL
				+ ", STATUS=" + STATUS + "]";
	}

	public User(Integer aEID, String eMAIL, String pASSWORD, Integer aDMINLVL, Integer sTATUS) {
		super();
		AEID = aEID;
		EMAIL = eMAIL;
		PASSWORD = pASSWORD;
		ADMINLVL = aDMINLVL;
		STATUS = sTATUS;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
