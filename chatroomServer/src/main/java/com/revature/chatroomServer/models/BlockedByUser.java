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
	private Integer BLOCKID;
	
	@Column(name = "BLOCKEDUSERID")
	private Integer BLOCKEDUSERID;
	
	@Column(name = "AE_ID")
	private Integer AE_ID;

	public Integer getBLOCKID() {
		return BLOCKID;
	}

	public void setBLOCKID(Integer bLOCKID) {
		BLOCKID = bLOCKID;
	}

	public Integer getBLOCKEDUSERID() {
		return BLOCKEDUSERID;
	}

	public void setBLOCKEDUSERID(Integer bLOCKEDUSERID) {
		BLOCKEDUSERID = bLOCKEDUSERID;
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
		result = prime * result + ((BLOCKEDUSERID == null) ? 0 : BLOCKEDUSERID.hashCode());
		result = prime * result + ((BLOCKID == null) ? 0 : BLOCKID.hashCode());
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
		if (BLOCKEDUSERID == null) {
			if (other.BLOCKEDUSERID != null)
				return false;
		} else if (!BLOCKEDUSERID.equals(other.BLOCKEDUSERID))
			return false;
		if (BLOCKID == null) {
			if (other.BLOCKID != null)
				return false;
		} else if (!BLOCKID.equals(other.BLOCKID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BlockedByUser [BLOCKID=" + BLOCKID + ", BLOCKEDUSERID=" + BLOCKEDUSERID + ", AE_ID=" + AE_ID + "]";
	}

	public BlockedByUser(Integer bLOCKID, Integer bLOCKEDUSERID, Integer aE_ID) {
		super();
		BLOCKID = bLOCKID;
		BLOCKEDUSERID = bLOCKEDUSERID;
		AE_ID = aE_ID;
	}

	public BlockedByUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
