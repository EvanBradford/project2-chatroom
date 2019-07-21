package com.revature.chatroomServer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.chatroomServer.dao.BlockedByUserDAO;
import com.revature.chatroomServer.models.BlockedByUser;


@Service
public class BlockedByUserServiceImpl implements BlockedByUserService {

	@Autowired
	private BlockedByUserDAO blockedbyuserDAO;// = new UserDAO();
	
	@Transactional
	public void registerBlockedByUser(BlockedByUser blockedByUser) {
		blockedbyuserDAO.save(blockedByUser);
	}

	@Transactional
	public List<BlockedByUser> list() {
		return blockedbyuserDAO.list();
	}
	
	@Transactional
	public List<BlockedByUser> findBlocked(Integer id) {
		return blockedbyuserDAO.findBlocked(id);
	}
	
	@Transactional
	public void delete(Integer id) {
		blockedbyuserDAO.delete(id);
	}

	@Override
	public void update(BlockedByUser blockedByUser) {
		blockedbyuserDAO.save(blockedByUser);
	}
}
