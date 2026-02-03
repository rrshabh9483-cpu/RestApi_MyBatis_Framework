package com.lcwr.mybatis_product_api.api.reorg.dao;

import com.lcwr.mybatis_product_api.api.reorg.model.ReorgOffer;
import com.lcwr.mybatis_product_api.api.reorg.model.ReorgOfferSearchCriteria;

public interface ReorgApiDao {

    ReorgOffer getReorgOffers(ReorgOfferSearchCriteria search);
}
