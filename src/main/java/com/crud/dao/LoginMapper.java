package com.crud.dao;

import org.springframework.stereotype.Repository;

import com.crud.pojo.Login;
@Repository
public interface LoginMapper{

	public Login findLoginById(int id);
	
	public Login findLoginByUsername(String username);
}
