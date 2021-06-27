package com.hyperwallet.clientsdk.model;

/**
 * @author fkrauthan
 */
public class HyperwalletBalanceTest extends BaseModelTest<HyperwalletBalance> {
    protected HyperwalletBalance createBaseModel() {
        HyperwalletBalance balance = new HyperwalletBalance();
        balance
                .currency("test-currency");
        return balance;
    }

    protected Class<HyperwalletBalance> createModelClass() {
        return HyperwalletBalance.class;
    }
}
