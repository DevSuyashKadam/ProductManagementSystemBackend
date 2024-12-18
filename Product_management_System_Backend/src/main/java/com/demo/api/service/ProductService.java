/**
 * 
 */
package com.demo.api.service;

import java.util.List;

import com.demo.api.model.Product;

/**
 * @author Suyash
 *
 */
public interface ProductService  {

	
	public Product saveProduct(Product product);
	
	public List<Product>getAllProduct();
	
	public Product getProductByid(Integer id);
	
	public String deleteProduct(Integer id);

	public Object editProduct(Product product, Integer id);
	

}
