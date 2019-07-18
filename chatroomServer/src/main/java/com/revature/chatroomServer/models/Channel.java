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
public class Channel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2256157303344337210L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ae_userid_gen")
	@SequenceGenerator(name = "ae_userid_gen", sequenceName = "AE_CHANNEL_seq", allocationSize = 1)
	@Column(name = "CHANNELID")
	private Integer channelId;

	@Column(name = "CHANNELNAME")
	private String channelName;

	@Column(name = "CHANNELTYPE")
	private Integer channelType;

	

	public Integer getChannelId() {
		return channelId;
	}



	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}



	public String getChannelName() {
		return channelName;
	}



	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}



	public Integer getChannelType() {
		return channelType;
	}



	public void setChannelType(Integer channelType) {
		this.channelType = channelType;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channelId == null) ? 0 : channelId.hashCode());
		result = prime * result + ((channelName == null) ? 0 : channelName.hashCode());
		result = prime * result + ((channelType == null) ? 0 : channelType.hashCode());
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
		if (channelId == null) {
			if (other.channelId != null)
				return false;
		} else if (!channelId.equals(other.channelId))
			return false;
		if (channelName == null) {
			if (other.channelName != null)
				return false;
		} else if (!channelName.equals(other.channelName))
			return false;
		if (channelType == null) {
			if (other.channelType != null)
				return false;
		} else if (!channelType.equals(other.channelType))
			return false;
		return true;
	}

	

	@Override
	public String toString() {
		return "Channel [channelId=" + channelId + ", channelName=" + channelName + ", channelType=" + channelType
				+ "]";
	}

	public Channel(Integer channelId, String channelName, Integer channelType) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.channelType = channelType;
	}

	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}



}
