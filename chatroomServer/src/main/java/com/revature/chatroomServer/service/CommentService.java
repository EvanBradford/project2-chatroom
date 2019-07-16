package com.revature.chatroomServer.service;

import java.util.List;

import com.revature.chatroomServer.models.Comments;

public interface CommentService {

	void registerComment(Comments comment);

	List<Comments> list();
	
	List<Comments> findByChannelId(Integer id);

	void delete(Integer id);

	void update(Comments comment);
}
