package com.demo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.api.exception.ProductNotFoundException;
import com.demo.api.model.Product;
import com.demo.api.service.ProductService;

@RestController
public class ProductController {
@Autowired
	private ProductService productService;
	

//suyash 
	@PostMapping("/saveProduct")
	public ResponseEntity<?>saveProduct(@RequestBody Product product){
		
		return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
	}
	@GetMapping("/")
	public ResponseEntity<?> getAllProduct(){
		return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getProductById(@PathVariable Integer id){
		return new ResponseEntity<>(productService.getProductByid(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
		
		return new ResponseEntity(productService.deleteProduct(id), HttpStatus.OK);
		
	}
	
	
	  @PostMapping("/editProduct/{id}") public
	  ResponseEntity<?>editProduct(@RequestBody Product product, @PathVariable
	  Integer id){ return new ResponseEntity<>(productService.editProduct(product,
	  id), HttpStatus.OK); }
	 
	
	
	
		/*
		 * @PostMapping("/editProduct/{id}") public ResponseEntity<?>
		 * editProduct(@RequestBody Product product, @PathVariable Integer id) { try {
		 * return new ResponseEntity<>(productService.editProduct(product, id),
		 * HttpStatus.OK); } catch (ProductNotFoundException ex) { return new
		 * ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND); } }
		 */
	
}
