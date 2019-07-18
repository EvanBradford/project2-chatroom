package com.revature.chatroomServer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.chatroomServer.models.UserInfo;


public interface UserInfoDAO extends JpaRepository<UserInfo,Integer>{

	@SuppressWarnings("unchecked")
	UserInfo save(UserInfo userinfo);

	@Query("select u from UserInfo u")
	List<UserInfo> list();
	
	@Query("select u from UserInfo u where u.id = :userId")
	UserInfo findOne(@Param("userId") Integer id);

	@Modifying
	@Query("delete from UserInfo where id = :userId")
	void delete(@Param("userId") Integer id);
}