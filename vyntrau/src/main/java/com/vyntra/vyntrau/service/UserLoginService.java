package com.vyntra.vyntrau.service;

import java.util.List;

import com.vyntra.vyntrau.model.Vyntrauser;

public interface UserLoginService {
   public void saveUser(Vyntrauser v);
   public List<Vyntrauser> fetchingAllDetails();
   public void deletingUser(Vyntrauser v);
   public Vyntrauser fetchingUserDetailThroughId(Vyntrauser v);
}
