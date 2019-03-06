package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.LoginMapper;
import com.crud.pojo.Login;

@Service
public class LoginService implements IService{

	@Autowired
	private LoginMapper loginMapper;
	
	public Login find(int id) {
		return loginMapper.findLoginById(id);
	}
	public Login findByUserName(String username) {
		return loginMapper.findLoginByUsername(username);
	}
}
