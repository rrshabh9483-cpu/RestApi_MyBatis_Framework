package com.lcwr.mybatis_product_api.api.reorg.model;

import com.lcwr.mybatis_product_api.api.model.VoteBreakdown;
import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@Data
public class ReorgOffer {
    private int offerId;
    private String offerVersionNumber;
    private String issuer;
    private List<String> type;
    private VoteBreakdown<Integer> positions;
    private int shortPositions;
    private BigDecimal shares;
    private BigDecimal shortShares;
    private ZonedDateTime replyByDate;
    private ZonedDateTime earlyReplyByDate;
    private ZonedDateTime expirationDate;

}
