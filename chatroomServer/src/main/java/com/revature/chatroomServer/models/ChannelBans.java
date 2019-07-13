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
	private Integer banId;
	
	@Column(name = "BANNEDUSERID")
	private Integer bannedUserId;
	
	@Column(name = "CHANNEL_BID")
	private Integer channel_Bid;

	public Integer getBanId() {
		return banId;
	}

	public void setBanId(Integer banId) {
		this.banId = banId;
	}

	public Integer getBannedUserId() {
		return bannedUserId;
	}

	public void setBannedUserId(Integer bannedUserId) {
		this.bannedUserId = bannedUserId;
	}

	public Integer getChannel_Bid() {
		return channel_Bid;
	}

	public void setChannel_Bid(Integer channel_Bid) {
		this.channel_Bid = channel_Bid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((banId == null) ? 0 : banId.hashCode());
		result = prime * result + ((bannedUserId == null) ? 0 : bannedUserId.hashCode());
		result = prime * result + ((channel_Bid == null) ? 0 : channel_Bid.hashCode());
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
		if (banId == null) {
			if (other.banId != null)
				return false;
		} else if (!banId.equals(other.banId))
			return false;
		if (bannedUserId == null) {
			if (other.bannedUserId != null)
				return false;
		} else if (!bannedUserId.equals(other.bannedUserId))
			return false;
		if (channel_Bid == null) {
			if (other.channel_Bid != null)
				return false;
		} else if (!channel_Bid.equals(other.channel_Bid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChannelBans [banId=" + banId + ", bannedUserId=" + bannedUserId + ", channel_Bid=" + channel_Bid + "]";
	}

	public ChannelBans(Integer banId, Integer bannedUserId, Integer channel_Bid) {
		super();
		this.banId = banId;
		this.bannedUserId = bannedUserId;
		this.channel_Bid = channel_Bid;
	}

	public ChannelBans() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
