/**
 * 
 */
package com.demo.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.api.model.Product;
import com.demo.api.repository.ProductRepository;

/**
 * @author ADMIN
 *
 */

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
	private ProductRepository productrepo;
	
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productrepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productrepo.findAll();
	}

	@Override
	public Product getProductByid(Integer id) {
		// TODO Auto-generated method stub
		return productrepo.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		Product product=productrepo.findById(id).get();
		if(product !=null) {
			productrepo.delete(product);
			return "Product Delete Successfully";
			
		}
		return "Something wrong on server";
	}
	
	public Product editProduct(Product p, Integer id) {
		
		Product oldProduct=productrepo.findById(id).get();
		oldProduct.setProductName(p.getProductName());
		oldProduct.setDescription(p.getDescription());
		oldProduct.setPrice(p.getPrice());
		oldProduct.setStatus(p.getStatus());
		return productrepo.save(oldProduct);
		
	}

}
