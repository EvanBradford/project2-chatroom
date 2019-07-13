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
	private Integer allowID;
	
	@Column(name = "ALLOWEDID")
	private Integer allowedId;
	
	@Column(name = "CHANNEL_AID")
	private Integer channel_AId;

	public Integer getAllowID() {
		return allowID;
	}

	public void setAllowID(Integer allowID) {
		this.allowID = allowID;
	}

	public Integer getAllowedId() {
		return allowedId;
	}

	public void setAllowedId(Integer allowedId) {
		this.allowedId = allowedId;
	}

	public Integer getChannel_AId() {
		return channel_AId;
	}

	public void setChannel_AId(Integer channel_AId) {
		this.channel_AId = channel_AId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allowID == null) ? 0 : allowID.hashCode());
		result = prime * result + ((allowedId == null) ? 0 : allowedId.hashCode());
		result = prime * result + ((channel_AId == null) ? 0 : channel_AId.hashCode());
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
		if (allowID == null) {
			if (other.allowID != null)
				return false;
		} else if (!allowID.equals(other.allowID))
			return false;
		if (allowedId == null) {
			if (other.allowedId != null)
				return false;
		} else if (!allowedId.equals(other.allowedId))
			return false;
		if (channel_AId == null) {
			if (other.channel_AId != null)
				return false;
		} else if (!channel_AId.equals(other.channel_AId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChannelUsers [allowID=" + allowID + ", allowedId=" + allowedId + ", channel_AId=" + channel_AId + "]";
	}

	public ChannelUsers(Integer allowID, Integer allowedId, Integer channel_AId) {
		super();
		this.allowID = allowID;
		this.allowedId = allowedId;
		this.channel_AId = channel_AId;
	}

	public ChannelUsers() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
