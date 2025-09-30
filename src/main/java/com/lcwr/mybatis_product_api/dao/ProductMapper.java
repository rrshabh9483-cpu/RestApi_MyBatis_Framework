package com.lcwr.mybatis_product_api.dao;

import com.lcwr.mybatis_product_api.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {
    // Method signature to call the stored procedure
    Product getProductByIdFromSP(@Param("productId") Long id);
}
