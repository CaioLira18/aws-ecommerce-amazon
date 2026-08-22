package com.caio.amazon.catalog.dto;

import com.caio.amazon.catalog.enums.CategoryEnum;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductResponseDTO {
  private String id;
  private String name;
  private String description;
  private Double price;
  private String imageUrl;
  private CategoryEnum category;
  private Integer stockQuantity;
}
