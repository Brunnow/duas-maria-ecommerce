package com.ecommerce.duas_marias.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String productName;
    private String image;
    private String quantity;
    private double price;
    private double discount;
    private double specialPrice;

}
