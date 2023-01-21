package com.misty.productservice.dto;

import java.math.BigDecimal;

import lombok.*;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
	 public String id;
	 public String name;
	 public String description;
	 public BigDecimal price;
}
