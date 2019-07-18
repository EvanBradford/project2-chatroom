package com.revature.chatroomServer.service;

import java.util.List;

import com.revature.chatroomServer.models.ChannelUsers;


public interface ChannelUsersService {

	void registerChannelUsers(ChannelUsers user);

	List<ChannelUsers> list();
	
	ChannelUsers findOne(Integer id);
	
	void delete(Integer id);

	void update(ChannelUsers user);
	
	

}