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
@Table(name = "AE_ALLOWED")
public class ChannelUsers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7191221987265081123L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ae_channelUserid_gen")
	@SequenceGenerator(name = "ae_channelUserid_gen", sequenceName = "AE_ALLOWED_seq", allocationSize = 1)
	@Column(name = "ALLOWID")
	private Integer ALLOWID;
	
	@Column(name = "ALLOWEDID")
	private Integer ALLOWEDID;
	
	@Column(name = "CHANNEL_AID")
	private Integer CHANNEL_AID;

	public Integer getALLOWID() {
		return ALLOWID;
	}

	public void setALLOWID(Integer aLLOWID) {
		ALLOWID = aLLOWID;
	}

	public Integer getALLOWEDID() {
		return ALLOWEDID;
	}

	public void setALLOWEDID(Integer aLLOWEDID) {
		ALLOWEDID = aLLOWEDID;
	}

	public Integer getCHANNEL_AID() {
		return CHANNEL_AID;
	}

	public void setCHANNEL_AID(Integer cHANNEL_AID) {
		CHANNEL_AID = cHANNEL_AID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ALLOWEDID == null) ? 0 : ALLOWEDID.hashCode());
		result = prime * result + ((ALLOWID == null) ? 0 : ALLOWID.hashCode());
		result = prime * result + ((CHANNEL_AID == null) ? 0 : CHANNEL_AID.hashCode());
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
		ChannelUsers other = (ChannelUsers) obj;
		if (ALLOWEDID == null) {
			if (other.ALLOWEDID != null)
				return false;
		} else if (!ALLOWEDID.equals(other.ALLOWEDID))
			return false;
		if (ALLOWID == null) {
			if (other.ALLOWID != null)
				return false;
		} else if (!ALLOWID.equals(other.ALLOWID))
			return false;
		if (CHANNEL_AID == null) {
			if (other.CHANNEL_AID != null)
				return false;
		} else if (!CHANNEL_AID.equals(other.CHANNEL_AID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChannelUsers [ALLOWID=" + ALLOWID + ", ALLOWEDID=" + ALLOWEDID + ", CHANNEL_AID=" + CHANNEL_AID + "]";
	}

	public ChannelUsers(Integer aLLOWID, Integer aLLOWEDID, Integer cHANNEL_AID) {
		super();
		ALLOWID = aLLOWID;
		ALLOWEDID = aLLOWEDID;
		CHANNEL_AID = cHANNEL_AID;
	}

	public ChannelUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
