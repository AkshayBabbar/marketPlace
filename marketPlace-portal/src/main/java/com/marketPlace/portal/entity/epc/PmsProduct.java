package com.marketPlace.portal.entity.epc;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long brandId;
    private Long productAttributeId;
    private String name;
    private String pic;
    @ApiModelProperty(value = "Item No.")
    private String productNo;
    @ApiModelProperty(value = "Delete status: false->not deleted; true->deleted")
    private Boolean deleteStatus;
    @ApiModelProperty(value = "Shelf status: false->off shelf; true->on shelf")
    private Boolean publishStatus;

    @ApiModelProperty(value = "New product status: false->Not new product; true->New product")
    private Boolean newStatus;
    @ApiModelProperty(value = "Recommended status; false->not recommended; true->recommended")
    private Boolean recommendStatus;
    @ApiModelProperty(value = "Audit Status: false-> not Approved;  true-> Approved")
    private Boolean verifyStatus;
    @ApiModelProperty(value = "Sort")
    private Integer sort;
    @ApiModelProperty(value = "Sales")
    private Integer sale;
    private BigDecimal price;
    @ApiModelProperty(value = "Promotional Price")
    private BigDecimal promotionPrice;
    @ApiModelProperty(value = "Gift growth value")
    private Integer giftGrowth;
    @ApiModelProperty(value = "gift points")
    private Integer giftPoint;
    @ApiModelProperty(value = "Limit the number of points used")
    private Integer usedPointsLimit;
    @ApiModelProperty(value = "Subtitle")
    private String subTitle;
    @ApiModelProperty(value = "market price")
    private BigDecimal originalPrice;
    @ApiModelProperty(value = "Inventory")
    private Integer stocksInInventory;
    @ApiModelProperty(value = "Inventory warning value")
    private Integer lowStock;
    @ApiModelProperty(value = "Unit")
    private String unit;
    @ApiModelProperty(value = "Product weight, default is grams")
    private BigDecimal weight;
    @ApiModelProperty(value = "Whether it is a preview product: 0->No; 1->Yes")
    private Integer previewStatus;
    @ApiModelProperty(value = "Product service separated by commas: 1->Worry-free return; 2->Quick refund; 3->Free shipping")
    private String serviceIds;
    private String keywords;
    private String note;
    @ApiModelProperty(value = "Album pictures, even product pictures are limited to 5, separated by commas")
    private String albumPics;
    private String detailTitle;
    @ApiModelProperty(value = "Promotion start time")
    private Date promotionStartTime;
    @ApiModelProperty(value = "Promotion end time")
    private Date promotionEndTime;
    @ApiModelProperty(value = "Activity purchase limit")
    private Integer promotionPerLimit;
    @ApiModelProperty(value = "Promotion type: 0->use original price without promotion; 1->use promotion price; 2->use member price; 3->use step price; 4->use full discount; 5->limited purchase")
    private Integer promotionType;
    @ApiModelProperty(value = "brand name")
    private String brandName;
    @ApiModelProperty(value = "product category name")
    private String productCategoryName;
    @ApiModelProperty(value = "product description")
    private String description;
    private String detailDesc;
    @ApiModelProperty(value = "Product details page content")
    private String detailHtml;
    @ApiModelProperty(value = "Mobile web page details")
    private String detailMobileHtml;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Boolean getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Boolean publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Boolean getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Boolean newStatus) {
        this.newStatus = newStatus;
    }

    public Boolean getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Boolean recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Boolean getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Boolean verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public Integer getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    public Integer getUsedPointsLimit() {
        return usedPointsLimit;
    }

    public void setUsedPointsLimit(Integer usedPointsLimit) {
        this.usedPointsLimit = usedPointsLimit;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getPreviewStatus() {
        return previewStatus;
    }

    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    public String getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getDetailHtml() {
        return detailHtml;
    }

    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }

    @Override
    public String toString() {
        return "PmsProduct{" +
                "id=" + id +
                ", brandid=" + brandId +
                ", productAttributeId=" + productAttributeId +
                ", name='" + name + '\'' +
                ", pic='" + pic + '\'' +
                ", productNo='" + productNo + '\'' +
                ", deleteStatus=" + deleteStatus +
                ", publishStatus=" + publishStatus +
                ", newStatus=" + newStatus +
                ", recommendStatus=" + recommendStatus +
                ", verifyStatus=" + verifyStatus +
                ", sort=" + sort +
                ", sale=" + sale +
                ", price=" + price +
                ", promotionPrice=" + promotionPrice +
                ", giftGrowth=" + giftGrowth +
                ", giftPoint=" + giftPoint +
                ", usedPointsLimit=" + usedPointsLimit +
                ", subTitle='" + subTitle + '\'' +
                ", originalPrice=" + originalPrice +
                ", stock=" + stocksInInventory +
                ", lowStock=" + lowStock +
                ", unit='" + unit + '\'' +
                ", weight=" + weight +
                ", previewStatus=" + previewStatus +
                ", serviceIds='" + serviceIds + '\'' +
                ", keywords='" + keywords + '\'' +
                ", note='" + note + '\'' +
                ", albumPics='" + albumPics + '\'' +
                ", detailTitle='" + detailTitle + '\'' +
                ", promotionStartTime=" + promotionStartTime +
                ", promotionEndTime=" + promotionEndTime +
                ", promotionPerLimit=" + promotionPerLimit +
                ", promotionType=" + promotionType +
                ", brandName='" + brandName + '\'' +
                ", productCategoryName='" + productCategoryName + '\'' +
                ", description='" + description + '\'' +
                ", detailDesc='" + detailDesc + '\'' +
                ", detailHtml='" + detailHtml + '\'' +
                ", detailMobileHtml='" + detailMobileHtml + '\'' +
                '}';
    }
}
