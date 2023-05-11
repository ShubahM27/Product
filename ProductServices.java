package com.careercamp.service;
import com.careercamp.dao.*;
import com.careercamp.dto.*;

import java.util.*;
public class ProductServices {
	private ProductDAO products;
	
	public ProductServices() {
		this .products= new ProductDAO();
	}
	public void addProduct(int prodId, String prodName, double price, int quantity, double discount) {
        ProductDTO product = new ProductDTO(prodId, prodName, price, quantity, discount);
        products.addProduct(product);
    }
	public List<ProductDTO> getAllProducts() {
        return products.getAllProducts();
    }
	public void deleteProduct(int prodId) throws ProductNotFoundException {
        products.deletProduct(prodId);
    }
	
	public void updateProduct(int prodId, String prodName, double price, int quantity, double discount) throws ProductNotFoundException {
        ProductDTO updatedProduct = new ProductDTO(prodId, prodName, price, quantity, discount);
        products.updateProduct(updatedProduct);
    }
	public ProductDTO searchProductById(int prodId) throws ProductNotFoundException {
        return products.searchProductByID(prodId);
    }
	public ProductDTO searchProductByName(String prodName) throws ProductNotFoundException {
        return products.searchProductByName(prodName);
    }
	
	public List<ProductDTO> getProductsByPrice(boolean ascending) {
        return products.getPRoductByPrice(ascending);
    }
	public List<ProductDTO> getProductsByDiscount(boolean ascending) {
        return products.getPRoductByDiscount(ascending);
    }
}
