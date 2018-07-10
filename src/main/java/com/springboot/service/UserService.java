package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;

@Service
public class UserService 
{
	  @Autowired
	  private UserMapper userMapper;
	
      public User findUser(int id)
      {
    	  return userMapper.findUser(id);
      }
}
