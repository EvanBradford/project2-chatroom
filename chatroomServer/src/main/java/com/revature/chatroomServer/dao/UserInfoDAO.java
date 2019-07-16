package com.revature.chatroomServer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.chatroomServer.models.User;
import com.revature.chatroomServer.models.UserInfo;


public interface UserInfoDAO extends JpaRepository<User,Integer>{

	UserInfo save(UserInfo userinfo);

	@Query("select u from UserInfo u")
	List<UserInfo> list();
	
	@Query("select u from UserInfo u where u.infoid = :infoId")
	UserInfo findOne(@Param("infoId") Integer id);

	@Modifying
	@Query("delete from UserInfo where infoid = :userId")
	void delete(@Param("userId") Integer id);
	
	@Modifying
	@Query("update User u set u.nickname = :nickname and u.birthdate = :birthdate and u.region = :region and u.profilePic = :profilePic where id = :infoId")
	User update(@Param("infoId") Integer id, @Param("nickname") String nickname, @Param("birthdate") String password, @Param("region") String region, @Param("profilePic") String profilePic);
}