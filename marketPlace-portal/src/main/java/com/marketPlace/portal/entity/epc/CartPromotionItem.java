package com.marketPlace.portal.entity.epc;

import com.marketPlace.portal.entity.oms.OmsCartItem;

import java.math.BigDecimal;


/**
 * @author Akshay Babbar
 * Packaging of promotional information in the shopping cart
 */

public class CartPromotionItem extends OmsCartItem {
    /**
     * Promotion Message Information
     */
    private String promotionMessage;
    /**
     * amount after applying coupon
     */
    private BigDecimal reduceAmount;
    /**
     * Updated count of stock after promotion is applied.
     */
    private Integer updatedPromotedStock;

    private Integer integration;
    /**
     * Purchased goods to check growth value.
     */
    private Integer growth;

    public String getPromotionMessage() {
        return promotionMessage;
    }

    public void setPromotionMessage(String promotionMessage) {
        this.promotionMessage = promotionMessage;
    }

    public BigDecimal getReduceAmount() {
        return reduceAmount;
    }

    public void setReduceAmount(BigDecimal reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    public Integer getUpdatedPromotedStock() {
        return updatedPromotedStock;
    }

    public void setUpdatedPromotedStock(Integer updatedPromotedStock) {
        this.updatedPromotedStock = updatedPromotedStock;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }
}
