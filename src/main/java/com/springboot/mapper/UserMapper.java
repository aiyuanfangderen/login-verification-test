package com.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.entity.User;

//@Mapper
public interface UserMapper 
{

	public User findUser(int id);
}
