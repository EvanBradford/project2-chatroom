package com.revature.chatroomServer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.chatroomServer.dao.ChannelDAO;
import com.revature.chatroomServer.models.Channel;

@Service
public class ChannelServiceImpl {
	
	@Autowired
	private ChannelDAO channelDAO;
	
	@Transactional
	void registerChannel(Channel channel)
	{
		channelDAO.save(channel);
	}

	@Transactional
	List<Channel> list()
	{
		return channelDAO.findAll();
	}
}
