package com.lcwr.mybatis_product_api.api.model;

import lombok.Data;

@Data
public class VoteBreakdown<T extends Number> {
    private T total;
    private T voted;

}
