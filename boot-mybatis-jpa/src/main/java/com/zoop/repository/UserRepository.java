package com.zoop.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.zoop.model.User;

public interface UserRepository extends Repository<User,String>{

	List<User> findAll();
	
}
