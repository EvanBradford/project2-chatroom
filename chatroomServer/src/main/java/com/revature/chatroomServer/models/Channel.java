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
	private Integer channelId;
	
	@Column(name = "CHANNELNAME")
	private String chanelName;
	
	@Column(name = "CHANNETYPE")
	private String channelType;

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public String getChanelName() {
		return chanelName;
	}

	public void setChanelName(String chanelName) {
		this.chanelName = chanelName;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chanelName == null) ? 0 : chanelName.hashCode());
		result = prime * result + ((channelId == null) ? 0 : channelId.hashCode());
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
		if (chanelName == null) {
			if (other.chanelName != null)
				return false;
		} else if (!chanelName.equals(other.chanelName))
			return false;
		if (channelId == null) {
			if (other.channelId != null)
				return false;
		} else if (!channelId.equals(other.channelId))
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
		return "Channel [channelId=" + channelId + ", chanelName=" + chanelName + ", channelType=" + channelType + "]";
	}

	public Channel(Integer channelId, String chanelName, String channelType) {
		super();
		this.channelId = channelId;
		this.chanelName = chanelName;
		this.channelType = channelType;
	}

	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
