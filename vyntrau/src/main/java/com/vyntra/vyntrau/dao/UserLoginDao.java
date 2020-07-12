package com.vyntra.vyntrau.dao;

import java.util.List;

import com.vyntra.vyntrau.model.Vyntrauser;

public interface UserLoginDao {
	public void saveUser(Vyntrauser v);
	   public List<Vyntrauser> fetchingAllDetails();
	   public void deletingUser(Vyntrauser v);
	   public Vyntrauser fetchingUserDetailThroughId(Vyntrauser v);

}
