package com.example.spring_angular_medium.service;

import com.example.spring_angular_medium.model.Product;
import com.example.spring_angular_medium.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product newProduct){
        Product product = getProductById(id);

        product.setName(newProduct.getName());
        product.setPrice(newProduct.getPrice());
        product.setDescription(newProduct.getDescription());

        return productRepository.save(product);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

}
