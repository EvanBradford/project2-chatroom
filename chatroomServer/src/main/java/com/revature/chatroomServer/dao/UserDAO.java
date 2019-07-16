package com.revature.chatroomServer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.chatroomServer.models.User;


public interface UserDAO extends JpaRepository<User,Integer>{

	@SuppressWarnings("unchecked")
	User save(User user);

	@Query("select u from User u")
	List<User> list();
	
	@Query("select u from User u where u.id = :userId")
	User findOne(@Param("userId") Integer id);

	@Modifying
	@Query("delete from User where id = :userId")
	void delete(@Param("userId") Integer id);
	
	@Modifying
	@Query("update User u set u.email = :email and u.password = :password where id = :userId")
	User update(@Param("userId") Integer id, @Param("email") String email, @Param("password") String password);
}