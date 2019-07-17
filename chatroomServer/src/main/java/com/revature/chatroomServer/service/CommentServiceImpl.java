package com.revature.chatroomServer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.chatroomServer.dao.CommentDAO;
import com.revature.chatroomServer.models.Comments;

@Service 
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentDAO commentDAO;
	

	@Transactional
	public void registerComment(Comments comment) {
		commentDAO.save(comment);	
	}


	@Transactional
	public List<Comments> list() {
		return commentDAO.findAll();
	}



	@Transactional
	public List<Comments> findByChannelId(Integer id) {
		return commentDAO.findByChannelId(id);
	}



	@Override
	public void delete(Integer id) {
		System.out.println("this isn't anything");// TODO Auto-generated method stub
		
	}



	@Override
	public void update(Comments comment) {
		System.out.println("this isn't a thing either ");// TODO Auto-generated method stub
		
	}
}