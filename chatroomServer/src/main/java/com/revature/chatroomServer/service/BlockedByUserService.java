package com.revature.chatroomServer.service;

import java.util.List;

import com.revature.chatroomServer.models.BlockedByUser;


public interface BlockedByUserService {

	void registerBlockedByUser(BlockedByUser blockedByUser);

	List<BlockedByUser> list();
	
	List<BlockedByUser> findBlocked(Integer id);
	
	void delete(Integer id);

	void update(BlockedByUser blockedByUser);
	
	

}