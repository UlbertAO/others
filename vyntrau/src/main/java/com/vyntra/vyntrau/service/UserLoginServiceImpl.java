package com.vyntra.vyntrau.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vyntra.vyntrau.dao.UserLoginDao;
import com.vyntra.vyntrau.model.Vyntrauser;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	@Autowired
	private UserLoginDao userLoginDao;
	@Override
	public void saveUser(Vyntrauser v)
	{
		userLoginDao.saveUser(v);
	}
	@Override
	public List<Vyntrauser> fetchingAllDetails()
	{
		return userLoginDao.fetchingAllDetails();
	}
	@Override
	public void deletingUser(Vyntrauser v)
	{
		userLoginDao.deletingUser(v);
	}
	@Override
	public Vyntrauser fetchingUserDetailThroughId(Vyntrauser v)
	{
		return userLoginDao.fetchingUserDetailThroughId(v);
	}
	

}
