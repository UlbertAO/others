package com.vyntra.vyntrau.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vyntra.vyntrau.dao.Productsdao;
import com.vyntra.vyntrau.model.products;


@Service
public class Proservicesimpl implements Productservice {
	@Autowired
	private Productsdao pd;
	@Override
	public void saveProduct(products p)
	{
		pd.saveProduct(p);
	}
	@Override
	 public List<products> fetchingProductDetails()
	 {
		return pd.fetchingProductDetails();
	}
	 
	 @Override
	 public void deletingproduct(products p)
	 {
		 pd.deletingproduct(p);
	 }
	
      
}
