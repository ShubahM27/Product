package com.careercamp.dao;

import com.careercamp.dto.ProductDTO;
import com.careercamp.service.ProductNotFoundException;

import java.util.*;


public class ProductDAO {
	private static ArrayList<ProductDTO>dataBase;
	
	public ProductDAO() {
		this.dataBase = new ArrayList<>();
	}
	
	public void addProduct(ProductDTO product) {
		dataBase.add(product);
	}
	public List<ProductDTO> allProducts(){
		return dataBase;
	}
	
	public void deletProduct(int prodID)throws ProductNotFoundException{
		for(ProductDTO product:dataBase) {
			if(product.getProdId()==prodID) {
				dataBase.remove(product);
				return;
			}
		}throw new ProductNotFoundException("Invalid Product ID to delete");
	}
	
	public void updateProduct(ProductDTO updatedProduct) throws ProductNotFoundException{
		for (int i=0;i<dataBase.size();i++) {
			ProductDTO temp = dataBase.get(i);
			if(temp.getProdId()==updatedProduct.getProdId()) {
				dataBase.set(i, updatedProduct);
				return;
			}
		}throw new ProductNotFoundException("Invalid Product ID to update");
	}
	
	public ProductDTO searchProductByID(int prodID)throws ProductNotFoundException{
		for(ProductDTO product : dataBase) {
			if(product.getProdId()==prodID) {
				return product;
			}
		}
		throw new ProductNotFoundException("Product Not Found");
	}
	
	public ProductDTO searchProductByName(String prodName)throws ProductNotFoundException{
		for(ProductDTO product : dataBase) {
			if(product.getProdName()==prodName) {
				return product;
			}
		}
		throw new ProductNotFoundException("Product Not Found");
	}
	
	public List <ProductDTO> getPRoductByPrice(boolean ascending){
		List <ProductDTO>sortedProducts=new ArrayList<>(dataBase);
		Collections.sort(sortedProducts,Comparator.comparingDouble(ProductDTO::getPrice));
		if(!ascending) {
			Collections.reverse(sortedProducts);
		}
		return sortedProducts;
	}
	
	public List <ProductDTO> getPRoductByDiscount(boolean ascending){
		List <ProductDTO>sortedProducts=new ArrayList<>(dataBase);
		Collections.sort(sortedProducts,Comparator.comparingDouble(ProductDTO::getDiscount));
		if(!ascending) {
			Collections.reverse(sortedProducts);
		}
		return sortedProducts;
	}

	public List<ProductDTO> getAllProducts() {

		return dataBase;
	}
	
}
