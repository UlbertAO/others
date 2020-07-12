package com.vyntra.vyntrau.dao;

import java.util.List;

import com.vyntra.vyntrau.model.products;


public interface Pro {
	public void saveProduct(products p);
    public List<products> fetchingProductDetails();
    public void deletingUser(products p);

}
