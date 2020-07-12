package com.vyntra.vyntrau.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vyntra.vyntrau.dao.Productsdao;
import com.vyntra.vyntrau.model.products;


@Repository
@Transactional
public class Productsdaoimpl implements Productsdao{
	@Autowired
	private EntityManager entityManger;
	@Override
	public void saveProduct(products p)
	{
		Session currentSession=entityManger.unwrap(Session.class);
		currentSession.saveOrUpdate(p);
	}
	@Override
	public List<products> fetchingProductDetails()
	{
		Session currentSession=entityManger.unwrap(Session.class);
		return ((EntityManager) currentSession).createQuery("from products",products.class).getResultList();
	}
	@Override
	public void deletingproduct(products p) {
		// TODO Auto-generated method stub
		Session currentSession=entityManger.unwrap(Session.class);
		products  ps=currentSession.get(products.class,p.getPid());
		currentSession.delete(ps);
		
	}

}
