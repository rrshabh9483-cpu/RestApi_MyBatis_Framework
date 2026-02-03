package com.lcwr.mybatis_product_api.api.reorg.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class ReorgOfferSearchCriteria {
    private List<String> accountGroupList;
    private List<Integer> custodianList;
    private List<String> repCode;

    private String issuer;
    private String offerType;
    private OfferStatus status;
    private List<String> cusipList;

    private LocalDateTime expirationDateStart;
    private LocalDateTime expirationDateEnd;

    private LocalDateTime replyByDateStart;
    private LocalDateTime replyByDateEnd;

    private LocalDate earrlyReplyByDateStart;
    private LocalDate earlyReplyByDateEnd;

    private String accountNumber;

}
