package com.lcwr.mybatis_product_api.api.reorg.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Arrays;

public enum OfferStatus {

    ALL("A" ),
    ELECTED("E" ),
    UNELECTED("U" );

    private final String value;

    OfferStatus(String value) {
        this.value = value;
        value = value;
    }

    public String getValue(){
        return value;
    }

    @Override
    public String toString() { return value; };

    @JsonCreator
    public static OfferStatus fromValue(final String value){
        return Arrays.stream(values()).filter(
                v->v.getValue().equalsIgnoreCase(value)).findFirst().orElse(null);

    }
}
