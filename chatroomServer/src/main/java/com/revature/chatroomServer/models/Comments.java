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
	private Integer commentId;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Column(name = "POSTDATE")
	private String postDate;
	
	@Column(name = "USER_ID")
	private String user_Id;
	
	@Column(name = "CHANNEL_ID")
	private Integer channel_Id;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public Integer getChannel_Id() {
		return channel_Id;
	}

	public void setChannel_Id(Integer channel_Id) {
		this.channel_Id = channel_Id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channel_Id == null) ? 0 : channel_Id.hashCode());
		result = prime * result + ((commentId == null) ? 0 : commentId.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((postDate == null) ? 0 : postDate.hashCode());
		result = prime * result + ((user_Id == null) ? 0 : user_Id.hashCode());
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
		if (channel_Id == null) {
			if (other.channel_Id != null)
				return false;
		} else if (!channel_Id.equals(other.channel_Id))
			return false;
		if (commentId == null) {
			if (other.commentId != null)
				return false;
		} else if (!commentId.equals(other.commentId))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (postDate == null) {
			if (other.postDate != null)
				return false;
		} else if (!postDate.equals(other.postDate))
			return false;
		if (user_Id == null) {
			if (other.user_Id != null)
				return false;
		} else if (!user_Id.equals(other.user_Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comments [commentId=" + commentId + ", content=" + content + ", postDate=" + postDate + ", user_Id="
				+ user_Id + ", channel_Id=" + channel_Id + "]";
	}

	public Comments(Integer commentId, String content, String postDate, String user_Id, Integer channel_Id) {
		super();
		this.commentId = commentId;
		this.content = content;
		this.postDate = postDate;
		this.user_Id = user_Id;
		this.channel_Id = channel_Id;
	}

	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
