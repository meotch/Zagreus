package com.ccwtac.zagreus.model;

import lombok.Data;

@Data
public class Payment {
    private String idempotencyKey;
    private AmountMoney amountMoney;
    private String sourceId;
    private Boolean autocomplete;
    private String customerId;
    private String locationId;
    private String referenceId;
    private String note;
    private AmountMoney appFeeMoney;


    @Data
    public class AmountMoney {
        private Double amount;
        private String currency;
    }
}
