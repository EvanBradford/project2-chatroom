package com.revature.chatroomServer.service;

import java.util.List;

import com.revature.chatroomServer.models.Channel;


public interface ChannelService {

	void registerChannel(Channel channel);

	List<Channel> list();
	
	Channel findOne(Integer id);
	
	List<Channel> listByType(Integer type);
	
	void delete(Integer id);

	void update(Channel channel);
	
	

}