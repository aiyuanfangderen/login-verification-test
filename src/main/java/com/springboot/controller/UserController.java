package com.springboot.controller;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.mockito.Mockito.mockitoSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.entity.User;
import com.springboot.service.UserService;

@Controller
public class UserController
{
	@Autowired
   private UserService userService;
	
	@RequestMapping("findUser")
	public void findUser(HttpSession session,HttpServletResponse response,HttpServletRequest request)
	{
		 String id1=request.getParameter("id");
		 int id=Integer.parseInt(id1);		
		//String username=request.getParameter("username");		
		//String password=request.getParameter("password");	
		User user=userService.findUser(id);
		if(user!=null)
		{
			if(session.getAttribute("id")==""||session.getAttribute("id")==null)
			{
				session.setAttribute("id", id1);
				System.out.println(user.getId());
				System.out.println(user.getName());
				System.out.println(user.getAge());
				System.out.println("111");
				System.out.println(session.getAttribute("id"));
			}
			
			else 
			{
				System.out.println("登陆失败");							
			}
			
		}
		
		
		
	}
   
}
