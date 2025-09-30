package com.lcwr.mybatis_product_api.service;

import com.lcwr.mybatis_product_api.dao.ProductMapper;
import com.lcwr.mybatis_product_api.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductMapper productMapper;

    // Dependency Injection of the ProductMapper (DAO)
    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    /**
     * Business logic to retrieve a product.
     * The actual database call uses the DAO, which is mapped to the stored procedure.
     */
    public Product getProductDetails(Long id) {
        // Calls the method defined in the DAO interface, which MyBatis maps to the stored procedure in the XML.
        return productMapper.getProductByIdFromSP(id);
    }

}
