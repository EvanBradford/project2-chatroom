package com.revature.chatroomServer.service;

import java.util.List;

import com.revature.chatroomServer.models.UserInfo;


public interface UserInfoService {

	void registerUserInfo(UserInfo userinfo);

	List<UserInfo> list();
	
	UserInfo findOne(Integer id);
	
	void delete(Integer id);

	void update(UserInfo userinfo);

}