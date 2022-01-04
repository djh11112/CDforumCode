package com.cdforum.manManage.service.impl;

import com.cdforum.manManage.dao.UserDao;
import com.cdforum.manManage.entities.userEntities.Users;
import com.cdforum.manManage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao dao;
	
	@Override
	public boolean add(Users dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Users get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Users> list()
	{
		return dao.findAll();
	}

}
