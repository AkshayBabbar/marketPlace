package com.marketPlace.portal.entity.epc;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class PmsSkuStock {
    private static final long serialVersionUID = 1L;
    private Long id;
    @ApiModelProperty(value = "sku code")
    private String skuCode;
    private BigDecimal price;
    @ApiModelProperty(value = "Inventory")
    private Integer stocksInInventory;
    @ApiModelProperty(value = "Alarming : Low Inventory")
    private Integer lowStock;
    @ApiModelProperty(value = "Sales")
    private Integer sales;
    @ApiModelProperty(value = "Display Picture.")
    private String pic;
    @ApiModelProperty(value = "Single Product Promotion Price")
    private BigDecimal promotionPrice;
    @ApiModelProperty(value = "Lock inventory")
    private Integer lockStock;
    @ApiModelProperty(value = "Product Sales Attributes, json format")
    private String spData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStocksInInventory() {
        return stocksInInventory;
    }

    public void setStocksInInventory(Integer stocksInInventory) {
        this.stocksInInventory = stocksInInventory;
    }

    public Integer getLowStock() {
        return lowStock;
    }

    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Integer getLockStock() {
        return lockStock;
    }

    public void setLockStock(Integer lockStock) {
        this.lockStock = lockStock;
    }

    public String getSpData() {
        return spData;
    }

    public void setSpData(String spData) {
        this.spData = spData;
    }


    @Override
    public String toString() {
        return "PmsSkuStock{" +
                "id=" + id +
                ", skuCode='" + skuCode + '\'' +
                ", price=" + price +
                ", stocksInInventory=" + stocksInInventory +
                ", lowStock=" + lowStock +
                ", sales=" + sales +
                ", pic='" + pic + '\'' +
                ", promotionPrice=" + promotionPrice +
                ", lockStock=" + lockStock +
                ", spData='" + spData + '\'' +
                '}';
    }
}
