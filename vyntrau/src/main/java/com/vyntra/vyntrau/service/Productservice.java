package com.vyntra.vyntrau.service;

import java.util.List;

import com.vyntra.vyntrau.model.products;


public interface Productservice {
	public void saveProduct(products p);
    public List<products> fetchingProductDetails();
    public void deletingproduct(products p);
    
}
