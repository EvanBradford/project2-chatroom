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
	private UserInfoDAO userinfoDAO;// = new UserinfoDAO();
	
	@Transactional
	public void registerUserInfo(UserInfo userinfo) {
		userinfoDAO.save(userinfo);
	}

	@Transactional
	public List<UserInfo> list() {
		return userinfoDAO.list();
	}
	
	@Transactional
	public UserInfo findOne(Integer id) {
		return userinfoDAO.findOne(id);
	}
	
	@Transactional
	public void delete(Integer id) {
		userinfoDAO.delete(id);
	}

	@Override
	public void update(UserInfo userinfo) {
		userinfoDAO.save(userinfo);
	}
}
