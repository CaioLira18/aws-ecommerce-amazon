package com.caio.amazon.catalog.dto;

import com.caio.amazon.catalog.enums.CategoryEnum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductRequestDTO {

  @NotBlank
  private String name;

  private String description;

  @NotNull
  @Positive
  private Double price;
  private String imageUrl;

  @NotNull
  private CategoryEnum category;

  @NotNull
  @PositiveOrZero
  private Integer stockQuantity;
}
