package com.revature.chatroomServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.chatroomServer.models.Channel;
import com.revature.chatroomServer.service.ChannelService;

@RestController
@RequestMapping("Channel")
public class ChannelController {
	
	@Autowired
	private ChannelService channelService;
	
	@PostMapping()
	public @ResponseBody void register(@RequestBody Channel channel) {
		System.out.println("ChannelController->save");
		channelService.registerChannel(channel);
	}

	@GetMapping()
	public List<Channel> list() {
		List<Channel> list = channelService.list();
		System.out.println("comments list is being called");
		return list;
	}
}
