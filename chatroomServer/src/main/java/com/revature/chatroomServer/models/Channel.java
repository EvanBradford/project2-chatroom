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
@Table(name = "AE_CHANNELS")
public class Channel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 45943578723171056L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ae_channelid_gen")
	@SequenceGenerator(name = "ae_channelid_gen", sequenceName = "AE_CHANNEL_seq", allocationSize = 1)
	@Column(name = "CHANNELID")
	private Integer CHANNELID;
	
	@Column(name = "CHANNELNAME")
	private String CHANNELNAME;
	
	@Column(name = "CHANNETYPE")
	private String CHANNELTYPE;

	public Integer getCHANNELID() {
		return CHANNELID;
	}

	public void setCHANNELID(Integer cHANNELID) {
		CHANNELID = cHANNELID;
	}

	public String getCHANNELNAME() {
		return CHANNELNAME;
	}

	public void setCHANNELNAME(String cHANNELNAME) {
		CHANNELNAME = cHANNELNAME;
	}

	public String getCHANNELTYPE() {
		return CHANNELTYPE;
	}

	public void setCHANNELTYPE(String cHANNELTYPE) {
		CHANNELTYPE = cHANNELTYPE;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CHANNELID == null) ? 0 : CHANNELID.hashCode());
		result = prime * result + ((CHANNELNAME == null) ? 0 : CHANNELNAME.hashCode());
		result = prime * result + ((CHANNELTYPE == null) ? 0 : CHANNELTYPE.hashCode());
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
		Channel other = (Channel) obj;
		if (CHANNELID == null) {
			if (other.CHANNELID != null)
				return false;
		} else if (!CHANNELID.equals(other.CHANNELID))
			return false;
		if (CHANNELNAME == null) {
			if (other.CHANNELNAME != null)
				return false;
		} else if (!CHANNELNAME.equals(other.CHANNELNAME))
			return false;
		if (CHANNELTYPE == null) {
			if (other.CHANNELTYPE != null)
				return false;
		} else if (!CHANNELTYPE.equals(other.CHANNELTYPE))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Channel [CHANNELID=" + CHANNELID + ", CHANNELNAME=" + CHANNELNAME + ", CHANNELTYPE=" + CHANNELTYPE
				+ "]";
	}

	public Channel(Integer cHANNELID, String cHANNELNAME, String cHANNELTYPE) {
		super();
		CHANNELID = cHANNELID;
		CHANNELNAME = cHANNELNAME;
		CHANNELTYPE = cHANNELTYPE;
	}

	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
