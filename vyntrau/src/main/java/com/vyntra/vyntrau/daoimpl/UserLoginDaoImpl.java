package com.vyntra.vyntrau.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vyntra.vyntrau.dao.UserLoginDao;
import com.vyntra.vyntrau.model.Vyntrauser;

@Repository
@Transactional
public class UserLoginDaoImpl implements UserLoginDao {
	
	@Autowired
	private EntityManager entityManger;
	@Override
	public void saveUser(Vyntrauser v)
	{
		Session currentSession=entityManger.unwrap(Session.class);
		currentSession.saveOrUpdate(v);
	}
	@Override
	public List<Vyntrauser> fetchingAllDetails()
	{
		Session currentSession=entityManger.unwrap(Session.class);
		return ((EntityManager) currentSession).createQuery("from Vyntrauser",Vyntrauser.class).getResultList();
	}
	@Override
	public void deletingUser(Vyntrauser v)
	{
		Session currentSession=entityManger.unwrap(Session.class);
		Vyntrauser vs=currentSession.get(Vyntrauser.class,v.getUid());
		currentSession.delete(vs);
	}
	
	@Override	
	public Vyntrauser fetchingUserDetailThroughId(Vyntrauser v)
	{
		Session currentSession=entityManger.unwrap(Session.class);
		v=currentSession.get(Vyntrauser.class,v.getUid());
		return v;
	}


}
