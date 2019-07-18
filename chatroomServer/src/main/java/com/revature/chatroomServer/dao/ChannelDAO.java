package com.revature.chatroomServer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.chatroomServer.models.Channel;


public interface ChannelDAO extends JpaRepository<Channel,Integer>{

	@SuppressWarnings("unchecked")
	Channel save(Channel channel);

	@Query("select u from Channel u")
	List<Channel> list();
	
	@Query("select u from Channel u where u.id = :userId")
	Channel findOne(@Param("userId") Integer id);

	@Modifying
	@Query("delete from Channel where id = :userId")
	void delete(@Param("userId") Integer id);
}