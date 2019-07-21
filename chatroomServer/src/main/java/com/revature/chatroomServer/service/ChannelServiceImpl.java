package com.revature.chatroomServer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.chatroomServer.dao.ChannelDAO;
import com.revature.chatroomServer.models.Channel;


@Service
public class ChannelServiceImpl implements ChannelService {

	@Autowired
	private ChannelDAO channelDAO;// = new ChannelDAO();
	
	@Transactional
	public void registerChannel(Channel channel) {
		channelDAO.save(channel);
	}

	@Transactional
	public List<Channel> list() {
		return channelDAO.list();
	}
	
	@Transactional
	public Channel findOne(Integer id) {
		return channelDAO.findOne(id);
	}
	
	@Transactional
	public List<Channel> listByType(Integer type) {
		return channelDAO.listByType(type);
	}
	
	@Transactional
	public void delete(Integer id) {
		channelDAO.delete(id);
	}

	@Transactional
	public void update(Channel channel) {
		channelDAO.save(channel);
	}
}
