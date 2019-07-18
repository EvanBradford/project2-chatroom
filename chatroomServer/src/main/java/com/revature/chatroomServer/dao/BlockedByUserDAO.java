package com.revature.chatroomServer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.chatroomServer.models.BlockedByUser;


public interface BlockedByUserDAO extends JpaRepository<BlockedByUser,Integer>{

	@SuppressWarnings("unchecked")
	BlockedByUser save(BlockedByUser user);

	@Query("select u from BlockedByUser u")
	List<BlockedByUser> list();
	
	@Query("select u from BlockedByUser u where u.id = :userId")
	BlockedByUser findOne(@Param("userId") Integer id);

	@Modifying
	@Query("delete from BlockedByUser where id = :userId")
	void delete(@Param("userId") Integer id);
}