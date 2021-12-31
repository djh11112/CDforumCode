package com.cdforum.manManage.service;

import com.cdforum.manManage.entities.userEntities.Users;

import java.util.List;

public interface UserService
{
	public boolean add(Users dept);

	public Users get(Long id);

	public List<Users> list();
}
