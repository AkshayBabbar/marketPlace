package com.marketPlace.portal.entity.epc;

import java.util.List;

public class CartProduct extends PmsProduct {

    private List<PmsProductAttributes> productAttributesList;
    private List<PmsSkuStock> skuStockList;

    public List<PmsProductAttributes> getProductAttributesList() {
        return productAttributesList;
    }

    public void setProductAttributesList(List<PmsProductAttributes> productAttributesList) {
        this.productAttributesList = productAttributesList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

}
