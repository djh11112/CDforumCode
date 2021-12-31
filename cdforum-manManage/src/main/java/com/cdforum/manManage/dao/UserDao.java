package com.cdforum.manManage.dao;

import com.cdforum.manManage.entities.userEntities.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao
{
	public boolean addDept(Users dept);

	public Users findById(Long id);

	public List<Users> findAll();
}
