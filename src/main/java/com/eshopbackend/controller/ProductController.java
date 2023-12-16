package com.eshopbackend.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eshopbackend.dto.ProductDto;
import com.eshopbackend.entity.Product;
import com.eshopbackend.service.impl.ProductServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	private final ProductServiceImpl productServiceImpl;
	
	@Autowired
    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }
	
	 @GetMapping("/product/{productId}")
	    public ResponseEntity<Product> getProductById(@PathVariable Long productId) {
	        Product product = productServiceImpl.getProductById(productId);

	        if (product != null) {
	            return ResponseEntity.ok(product);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	
	 @GetMapping("/products")
	 public ResponseEntity<List<ProductDto>> getAllProducts() {
		    List<Product> products = productServiceImpl.getAllProducts();

		    List<ProductDto> productDtos = products.stream()
		            .map(this::mapToProductDto)
		            .collect(Collectors.toList());

		    return new ResponseEntity<>(productDtos, HttpStatus.OK);
		}
	 
	
	 
		 @GetMapping("/allproducts")
		 public ResponseEntity<List<Product>> getAllProductsNoFormat() {
		        List<Product> products = productServiceImpl.getAllProducts();
		        return new ResponseEntity<>(products, HttpStatus.OK);
		  }
	 
	 	@GetMapping("/category/products")
	 	public ResponseEntity<List<ProductDto>> getProductByCategory(@RequestParam Long categoryId) {
	 	    
	 	    List<Product> products = productServiceImpl.getProductsByCategoryId(categoryId);

	 	    List<ProductDto> productDtos = products.stream()
	 	            .map(this::mapToProductDto)
	 	            .collect(Collectors.toList());

	 	    return new ResponseEntity<>(productDtos, HttpStatus.OK);
	 	}
	 	
	 	@GetMapping("/category/products/all")
	    public ResponseEntity<List<Product>> getProductByCategoryNoFormat(@RequestParam Long categoryId) {
	        List<Product> products = productServiceImpl.getProductsByCategoryId(categoryId);
	        return ResponseEntity.ok(products);
	    }
	 	
	 	
	 	 private ProductDto mapToProductDto(Product product) {
			    ProductDto productDto = new ProductDto();
			    
			    productDto.setId(product.getId());
			    productDto.setProductName(product.getName());
			    productDto.setProductPrice(product.getUnitPrice());
			    productDto.setCurrency(product.getCurrency());
			    productDto.setDiscountPrice(product.getDiscountPrice());
			    productDto.setCategory(String.valueOf(product.getCategory().getId()));
			    productDto.setProductDescription(product.getDescription());
			    productDto.setProductCount(String.valueOf(product.getUnitsInStock()));
			    
			    BigDecimal thresholdBigDecimal = BigDecimal.valueOf(0);
			    
			    if(product.getDiscountPrice().compareTo(thresholdBigDecimal) <= 0) {
			    	productDto.setIsDiscount(false);
			    }else {
			    	productDto.setIsDiscount(true);
			    }
			    
			    if ("".equals(product.getLabel())) {
			        productDto.setLabel(product.getLabel());
			        productDto.setIsLabel(false);
			        productDto.setLabelClass("");
			    } else if ("HOT".equals(product.getLabel())) {
			        productDto.setLabel(product.getLabel());
			        productDto.setIsLabel(true);
			        productDto.setLabelClass("out-of-stock");
			    } else if ("NEW".equals(product.getLabel())) {
			        productDto.setLabel(product.getLabel());
			        productDto.setIsLabel(true);
			        productDto.setLabelClass("new");
			    } else {
			        productDto.setLabel(product.getLabel());
			        productDto.setIsLabel(false);
			        productDto.setLabelClass("");
			    }
			    
			    productDto.setSize(product.getSize());
			    productDto.setDefaultImg(product.getPrimaryImageUrl());
			    productDto.setAddToCartImg(product.getAddToCartImageUrl());
			    productDto.setHoverImg(product.getHoverImageUrl());
			    
			    return productDto;
			}

}
