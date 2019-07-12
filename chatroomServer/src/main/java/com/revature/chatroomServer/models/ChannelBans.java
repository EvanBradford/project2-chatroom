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
@Table(name = "AE_BANNED")
public class ChannelBans implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4897223981270685517L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ae_channelBanid_gen")
	@SequenceGenerator(name = "ae_channelBanid_gen", sequenceName = "AE_BANNED_seq", allocationSize = 1)
	@Column(name = "BANID")
	private Integer BANID;
	
	@Column(name = "BANNEDUSERID")
	private Integer BANNEDUSERID;
	
	@Column(name = "CHANNEL_BID")
	private Integer CHANNEL_BID;

	public Integer getBANID() {
		return BANID;
	}

	public void setBANID(Integer bANID) {
		BANID = bANID;
	}

	public Integer getBANNEDUSERID() {
		return BANNEDUSERID;
	}

	public void setBANNEDUSERID(Integer bANNEDUSERID) {
		BANNEDUSERID = bANNEDUSERID;
	}

	public Integer getCHANNEL_BID() {
		return CHANNEL_BID;
	}

	public void setCHANNEL_BID(Integer cHANNEL_BID) {
		CHANNEL_BID = cHANNEL_BID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BANID == null) ? 0 : BANID.hashCode());
		result = prime * result + ((BANNEDUSERID == null) ? 0 : BANNEDUSERID.hashCode());
		result = prime * result + ((CHANNEL_BID == null) ? 0 : CHANNEL_BID.hashCode());
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
		ChannelBans other = (ChannelBans) obj;
		if (BANID == null) {
			if (other.BANID != null)
				return false;
		} else if (!BANID.equals(other.BANID))
			return false;
		if (BANNEDUSERID == null) {
			if (other.BANNEDUSERID != null)
				return false;
		} else if (!BANNEDUSERID.equals(other.BANNEDUSERID))
			return false;
		if (CHANNEL_BID == null) {
			if (other.CHANNEL_BID != null)
				return false;
		} else if (!CHANNEL_BID.equals(other.CHANNEL_BID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChannelBans [BANID=" + BANID + ", BANNEDUSERID=" + BANNEDUSERID + ", CHANNEL_BID=" + CHANNEL_BID + "]";
	}

	public ChannelBans(Integer bANID, Integer bANNEDUSERID, Integer cHANNEL_BID) {
		super();
		BANID = bANID;
		BANNEDUSERID = bANNEDUSERID;
		CHANNEL_BID = cHANNEL_BID;
	}

	public ChannelBans() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
