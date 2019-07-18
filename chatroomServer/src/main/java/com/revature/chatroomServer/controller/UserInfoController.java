package com.revature.chatroomServer.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.chatroomServer.models.UserInfo;
import com.revature.chatroomServer.service.UserInfoService;

@RestController
@RequestMapping("UserInfo")
public class UserInfoController {

	@Autowired
	private UserInfoService userinfoService;

	@PostMapping()
	public @ResponseBody void register(@RequestBody UserInfo userinfo) {
		System.out.println("UserController->save");
		userinfoService.registerUserInfo(userinfo);
	}

	@PutMapping("/{id}")
	public @ResponseBody void update(@PathVariable("id") Integer id,@RequestBody UserInfo userinfo) {
		System.out.println("UserController->update" + id);
		userinfoService.update(userinfo);
	}

	@GetMapping()
	public List<UserInfo> list() {
		List<UserInfo> list = userinfoService.list();
		return list;
	}

	@GetMapping("/{id}")
	public UserInfo findOne(@PathVariable("id") Integer id) {
		UserInfo user = userinfoService.findOne(id);
		return user;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		userinfoService.delete(id);
	}
}