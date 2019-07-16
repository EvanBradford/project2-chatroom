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

import com.revature.chatroomServer.models.Comments;
import com.revature.chatroomServer.models.User;
import com.revature.chatroomServer.service.CommentService;
import com.revature.chatroomServer.service.UserService;

@RestController
@RequestMapping("Comment")
public class CommentController {
	
@Autowired
private CommentService commentService;

@PostMapping()
public @ResponseBody void register(@RequestBody Comments comment) {
	System.out.println("UserController->save");
	commentService.registerComment(comment);
}

@PutMapping("/{id}")
public @ResponseBody void update(@PathVariable("id") Integer id, @RequestBody Comments comment){
	System.out.println("comment Controller-> update" +id);
	commentService.update(comment);
}


	@GetMapping()
	public List<Comments> list() {
		List<Comments> list = commentService.list();
		System.out.println("comments list is being called");
		return list;
	}

	@GetMapping("/{id}")
	public List<Comments> findByChannelId(@PathVariable("id") Integer id) {
		List<Comments> list = commentService.findByChannelId(id);
		System.out.println("comments list by channel is being called");
		return list;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		commentService.delete(id);
	}

}
