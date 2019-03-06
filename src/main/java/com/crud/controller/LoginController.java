package com.crud.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.pojo.Login;
import com.crud.service.LoginService;

@RequestMapping("/login")
@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/hi")
	public String mm(String username,String password,HttpServletRequest request) {
		Login login = loginService.findByUserName(username);
		if(login!=null) {
			if(login.getPassword().equals(password)) {
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				return "redirect:/student/findStudentByPage/1";
			}
			else {
				return "false";
				
			}
		}
		else {
			return "false";
		}	
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/index.jsp";
	}
	
	
}
