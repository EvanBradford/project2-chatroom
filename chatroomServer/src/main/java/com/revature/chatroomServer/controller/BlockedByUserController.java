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


import com.revature.chatroomServer.models.BlockedByUser;
import com.revature.chatroomServer.service.BlockedByUserService;

@RestController
@RequestMapping("BlockedByUser")
public class BlockedByUserController {

	@Autowired
	private BlockedByUserService blockedByUserService;

	@PostMapping()
	public @ResponseBody void register(@RequestBody BlockedByUser user) {
		System.out.println("UserController->save");
		blockedByUserService.registerBlockedByUser(user);
	}

	@PutMapping("/{id}")
	public @ResponseBody void update(@PathVariable("id") Integer id,@RequestBody BlockedByUser user) {
		System.out.println("UserController->update" + id);
		user.setAe_Id(id);//this is what takes the set ID value
		blockedByUserService.update(user);
	}

	@GetMapping()
	public List<BlockedByUser> list() {
		List<BlockedByUser> list = blockedByUserService.list();
		return list;
	}

	@GetMapping("/{id}")
	public List<BlockedByUser> findBlocked(@PathVariable("id") Integer id) {
		List<BlockedByUser> users = blockedByUserService.findBlocked(id);
		return users;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		blockedByUserService.delete(id);
	}
}