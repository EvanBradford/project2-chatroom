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
@Table(name = "AE_COMMENTS")
public class Comments implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8612664882809210623L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ae_commentsid_gen")
	@SequenceGenerator(name = "ae_commentsid_gen", sequenceName = "AE_COMMENTS_seq", allocationSize = 1)
	@Column(name = "COMMENTID")
	private Integer COMMENTID;
	
	@Column(name = "CONTENT")
	private String CONTENT;
	
	@Column(name = "POSTDATE")
	private String POSTDATE;
	
	@Column(name = "USER_ID")
	private String USER_ID;
	
	@Column(name = "CHANNEL_ID")
	private Integer CHANNEL_ID;

	public Integer getCOMMENTID() {
		return COMMENTID;
	}

	public void setCOMMENTID(Integer cOMMENTID) {
		COMMENTID = cOMMENTID;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}

	public String getPOSTDATE() {
		return POSTDATE;
	}

	public void setPOSTDATE(String pOSTDATE) {
		POSTDATE = pOSTDATE;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public Integer getCHANNEL_ID() {
		return CHANNEL_ID;
	}

	public void setCHANNEL_ID(Integer cHANNEL_ID) {
		CHANNEL_ID = cHANNEL_ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CHANNEL_ID == null) ? 0 : CHANNEL_ID.hashCode());
		result = prime * result + ((COMMENTID == null) ? 0 : COMMENTID.hashCode());
		result = prime * result + ((CONTENT == null) ? 0 : CONTENT.hashCode());
		result = prime * result + ((POSTDATE == null) ? 0 : POSTDATE.hashCode());
		result = prime * result + ((USER_ID == null) ? 0 : USER_ID.hashCode());
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
		Comments other = (Comments) obj;
		if (CHANNEL_ID == null) {
			if (other.CHANNEL_ID != null)
				return false;
		} else if (!CHANNEL_ID.equals(other.CHANNEL_ID))
			return false;
		if (COMMENTID == null) {
			if (other.COMMENTID != null)
				return false;
		} else if (!COMMENTID.equals(other.COMMENTID))
			return false;
		if (CONTENT == null) {
			if (other.CONTENT != null)
				return false;
		} else if (!CONTENT.equals(other.CONTENT))
			return false;
		if (POSTDATE == null) {
			if (other.POSTDATE != null)
				return false;
		} else if (!POSTDATE.equals(other.POSTDATE))
			return false;
		if (USER_ID == null) {
			if (other.USER_ID != null)
				return false;
		} else if (!USER_ID.equals(other.USER_ID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comments [COMMENTID=" + COMMENTID + ", CONTENT=" + CONTENT + ", POSTDATE=" + POSTDATE + ", USER_ID="
				+ USER_ID + ", CHANNEL_ID=" + CHANNEL_ID + "]";
	}

	public Comments(Integer cOMMENTID, String cONTENT, String pOSTDATE, String uSER_ID, Integer cHANNEL_ID) {
		super();
		COMMENTID = cOMMENTID;
		CONTENT = cONTENT;
		POSTDATE = pOSTDATE;
		USER_ID = uSER_ID;
		CHANNEL_ID = cHANNEL_ID;
	}

	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
