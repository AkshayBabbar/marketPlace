package com.marketPlace.portal.entity.oms;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsCartItem implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productId;
    private Long memberId;
    @ApiModelProperty(value = "Purchase Quantity")
    private Integer quantity;
    @ApiModelProperty(value = "The price added to the shopping cart")
    private BigDecimal price;
    @ApiModelProperty(value = "Product main image")
    private String productPic;
    @ApiModelProperty(value = "Product Name")
    private String productName;
    @ApiModelProperty(value = "Product subtitle (selling point)")
    private String productSubTitle;
    @ApiModelProperty(value = "product sku barcode")
    private String productSkuCode;
    @ApiModelProperty(value = "Creation Time")
    private Date createDate;
    @ApiModelProperty(value = "Modification Time")
    private Date modifyDate;
    @ApiModelProperty(value = "Delete or not")
    private Integer deleteStatus;// TODO :: Need to check if it can be boolean??
    @ApiModelProperty(value = "Product Category")
    private Long productCategoryId;
    private String productBrand;
    @ApiModelProperty(value = "Commodity sales properties: [{'key':'color','value':'color'},{'key':'capacity','value':'4G'}]")
    private String productAttr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSubTitle() {
        return productSubTitle;
    }

    public void setProductSubTitle(String productSubTitle) {
        this.productSubTitle = productSubTitle;
    }

    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    @Override
    public String toString() {
        return "OmsCartItem{" +
                "id=" + id +
                ", productId=" + productId +
                ", memberId=" + memberId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", productPic='" + productPic + '\'' +
                ", productName='" + productName + '\'' +
                ", productSubTitle='" + productSubTitle + '\'' +
                ", productSkuCode='" + productSkuCode + '\'' +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", deleteStatus=" + deleteStatus +
                ", productCategoryId=" + productCategoryId +
                ", productBrand='" + productBrand + '\'' +
                ", productAttr='" + productAttr + '\'' +
                '}';
    }
}
