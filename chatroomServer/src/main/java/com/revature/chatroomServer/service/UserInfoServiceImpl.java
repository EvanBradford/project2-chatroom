package com.revature.chatroomServer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.chatroomServer.dao.UserInfoDAO;
import com.revature.chatroomServer.models.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDAO userInfoDAO;// = new UserDAO();
	
	@Transactional
	public void registerUserInfo(UserInfo userinfo) {
		userInfoDAO.save(userinfo);
	}
	@Transactional
	public List<UserInfo> list() {
		return userInfoDAO.list();
	}
	
	@Transactional
	public UserInfo findOne(Integer id) {
		return userInfoDAO.findOne(id);
	}
	
	@Transactional
	public void delete(Integer id) {
		userInfoDAO.delete(id);
	}
	@Override
	public void update(UserInfo userinfo) {
		userInfoDAO.save(userinfo);
	}
}