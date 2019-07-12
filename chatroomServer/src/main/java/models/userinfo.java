package models;

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
public class userinfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8559524895599820600L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userid_gen")
	@SequenceGenerator(name = "userid_gen", sequenceName = "AE_userinfo_seq", allocationSize = 1)
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
	
	public userinfo() {
		;
	}

	public userinfo(Integer infoid, String nickname, String birthdate, String region, String profilePic) {
		super();
		this.infoid = infoid;
		this.nickname = nickname;
		this.birthdate = birthdate;
		this.region = region;
		this.profilePic = profilePic;
	}
	
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
}