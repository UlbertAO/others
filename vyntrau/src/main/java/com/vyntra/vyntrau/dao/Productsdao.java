package com.vyntra.vyntrau.dao;

import java.util.List;

import com.vyntra.vyntrau.model.products;

public interface Productsdao {
	public void saveProduct(products p);
    public List<products> fetchingProductDetails();
    public void deletingproduct(products p);
	
}
