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
@Table(name = "AE_BLOCKED")
public class BlockedByUser implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -8689849324990486071L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ae_block_gen")
	@SequenceGenerator(name = "ae_block_gen", sequenceName = "AE_block_seq", allocationSize = 1)
	@Column(name = "BLOCKID")
	private Integer blockId;
	
	@Column(name = "BLOCKEDUSERID")
	private Integer blockUserId;
	
	@Column(name = "AE_ID")
	private Integer AE_ID;

	public Integer getBlockId() {
		return blockId;
	}

	public void setBlockId(Integer blockId) {
		this.blockId = blockId;
	}

	public Integer getBlockUserId() {
		return blockUserId;
	}

	public void setBlockUserId(Integer blockUserId) {
		this.blockUserId = blockUserId;
	}

	public Integer getAE_ID() {
		return AE_ID;
	}

	public void setAE_ID(Integer aE_ID) {
		AE_ID = aE_ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AE_ID == null) ? 0 : AE_ID.hashCode());
		result = prime * result + ((blockId == null) ? 0 : blockId.hashCode());
		result = prime * result + ((blockUserId == null) ? 0 : blockUserId.hashCode());
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
		BlockedByUser other = (BlockedByUser) obj;
		if (AE_ID == null) {
			if (other.AE_ID != null)
				return false;
		} else if (!AE_ID.equals(other.AE_ID))
			return false;
		if (blockId == null) {
			if (other.blockId != null)
				return false;
		} else if (!blockId.equals(other.blockId))
			return false;
		if (blockUserId == null) {
			if (other.blockUserId != null)
				return false;
		} else if (!blockUserId.equals(other.blockUserId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BlockedByUser [blockId=" + blockId + ", blockUserId=" + blockUserId + ", AE_ID=" + AE_ID + "]";
	}

	public BlockedByUser(Integer blockId, Integer blockUserId, Integer aE_ID) {
		super();
		this.blockId = blockId;
		this.blockUserId = blockUserId;
		AE_ID = aE_ID;
	}

	public BlockedByUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
