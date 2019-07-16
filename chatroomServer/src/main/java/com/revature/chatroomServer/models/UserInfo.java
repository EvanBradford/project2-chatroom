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
@Table(name = "AE_USERINFO")
public class UserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8559524895599820600L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userinfoid_gen")
	@SequenceGenerator(name = "userinfoid_gen", sequenceName = "AE_userinfo_seq", allocationSize = 1)
	@Column(name = "INFOID")
	private Integer infoid;
	
	@Column(name = "NICKNAME")
	private String nickname;

	@Column(name = "BIRTHDATE")
	private String birthdate;

	@Column(name = "REGION")
	private String region;
	
	@Column(name = "PROFILEPIC")
	private String profilePic;

	public Integer getInfoid() {
		return infoid;
	}

	public void setInfoid(Integer infoid) {
		this.infoid = infoid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((infoid == null) ? 0 : infoid.hashCode());
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((profilePic == null) ? 0 : profilePic.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
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
		UserInfo other = (UserInfo) obj;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (infoid == null) {
			if (other.infoid != null)
				return false;
		} else if (!infoid.equals(other.infoid))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (profilePic == null) {
			if (other.profilePic != null)
				return false;
		} else if (!profilePic.equals(other.profilePic))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserInfo [infoid=" + infoid + ", nickname=" + nickname + ", birthdate=" + birthdate + ", region="
				+ region + ", profilePic=" + profilePic + "]";
	}

	public UserInfo(Integer infoid, String nickname, String birthdate, String region, String profilePic) {
		super();
		this.infoid = infoid;
		this.nickname = nickname;
		this.birthdate = birthdate;
		this.region = region;
		this.profilePic = profilePic;
	}

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}