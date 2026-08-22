package com.caio.amazon.catalog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.caio.amazon.catalog.dto.ProductRequestDTO;
import com.caio.amazon.catalog.dto.ProductResponseDTO;
import com.caio.amazon.catalog.entities.Product;
import com.caio.amazon.catalog.exceptions.ResourceNotFoundException;
import com.caio.amazon.catalog.repository.ProductRepository;

@Service
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public ProductResponseDTO createProduct(ProductRequestDTO requestDTO) {
    Product product = toEntity(requestDTO);
    Product saved = productRepository.save(product);
    return toResponseDTO(saved);
  }

  public ProductResponseDTO getProductById(String id) {
    Product product = productRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado: " + id));
    return toResponseDTO(product);
  }

  public List<ProductResponseDTO> getAllProducts() {
    return productRepository.findAll()
        .stream()
        .map(this::toResponseDTO)
        .collect(Collectors.toList());
  }

  public ProductResponseDTO updateProduct(String id, ProductRequestDTO requestDTO) {
    Product existing = productRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado: " + id));

    existing.setName(requestDTO.getName());
    existing.setDescription(requestDTO.getDescription());
    existing.setPrice(requestDTO.getPrice());
    existing.setImageUrl(requestDTO.getImageUrl());
    existing.setCategory(requestDTO.getCategory());
    existing.setStockQuantity(requestDTO.getStockQuantity());

    Product updated = productRepository.save(existing);
    return toResponseDTO(updated);
  }

  public void deleteProduct(String id) {
    if (!productRepository.existsById(id)) {
      throw new ResourceNotFoundException("Produto não encontrado: " + id);
    }
    productRepository.deleteById(id);
  }

  private Product toEntity(ProductRequestDTO dto) {
    Product product = new Product();
    product.setName(dto.getName());
    product.setDescription(dto.getDescription());
    product.setPrice(dto.getPrice());
    product.setImageUrl(dto.getImageUrl());
    product.setCategory(dto.getCategory());
    product.setStockQuantity(dto.getStockQuantity());
    return product;
  }

  private ProductResponseDTO toResponseDTO(Product product) {
    ProductResponseDTO dto = new ProductResponseDTO();
    dto.setId(product.getId());
    dto.setName(product.getName());
    dto.setDescription(product.getDescription());
    dto.setPrice(product.getPrice());
    dto.setImageUrl(product.getImageUrl());
    dto.setCategory(product.getCategory());
    dto.setStockQuantity(product.getStockQuantity());
    return dto;
  }
}
