package com.revature.chatroomServer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.revature.chatroomServer.models.Channel;

public interface ChannelDAO extends JpaRepository<Channel,Integer>{
	@SuppressWarnings("unchecked")
	Channel save(Channel channel);

	@Query("select c from Comments c")
	List<Channel> list();
}
