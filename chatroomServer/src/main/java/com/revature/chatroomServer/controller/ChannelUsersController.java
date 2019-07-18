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

import com.revature.chatroomServer.models.ChannelUsers;
import com.revature.chatroomServer.service.ChannelUsersService;

@RestController
@RequestMapping("ChannelUsers")
public class ChannelUsersController {

	@Autowired
	private ChannelUsersService channelusersService;

	@PostMapping()
	public @ResponseBody void register(@RequestBody ChannelUsers user){
		System.out.println("UserController->save");
		channelusersService.registerChannelUsers(user);
	}

	@PutMapping("/{id}")
	public @ResponseBody void update(@PathVariable("id") Integer id,@RequestBody ChannelUsers user) {
		System.out.println("UserController->update" + id);
		channelusersService.update(user);
	}

	@GetMapping()
	public List<ChannelUsers> list() {
		List<ChannelUsers> list = channelusersService.list();
		return list;
	}

	@GetMapping("/{id}")
	public ChannelUsers findOne(@PathVariable("id") Integer id) {
		ChannelUsers user = channelusersService.findOne(id);
		return user;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		channelusersService.delete(id);
	}
}