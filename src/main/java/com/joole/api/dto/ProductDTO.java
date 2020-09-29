package com.joole.api.dto;

import com.joole.api.entity.Product;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class ProductDTO {

    public static ProductDTO convertProductToProductDTO(Product productEntity){

        ProductDTO productDTO = new ProductDTO();

        BeanUtils.copyProperties(productEntity,productDTO);

        return productDTO;
    }

    public static List<ProductDTO> convertProductToProductDTO(Set<Product> productEntities){
        return productEntities.stream()
                .map(e->convertProductToProductDTO(e))
                .collect(Collectors.toList());
    }



}
