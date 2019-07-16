package com.revature.chatroomServer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.chatroomServer.models.Comments;

public interface CommentDAO extends JpaRepository<Comments,Integer>{
	@SuppressWarnings("unchecked")
	Comments save(Comments comment);

	@Query("select c from Comments c")
	List<Comments> list();
	
	@Query("select c from Comments c where c.channel_Id = :channelId")
	List<Comments> findByChannelId(@Param("channelId") Integer id);
	
	

	//this parts needs to be something like select all where id things match the channel id
	//or we can do it with the async pipes but that is not going to work out long term. 
	
//	@Modifying
//	@Query("delete from Comments where id = :commentId")
//	void delete(@Param("commentId") Integer id);
//	
//	@Query("select c from Comments c where c.channelId = :channelId")
//	Comments findByEmailAndPassword(@Param("channelId")  email, @Param("password") String password);
}
