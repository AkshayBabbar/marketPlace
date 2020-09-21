package com.marketPlace.portal.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class CmsSubject implements Serializable {
    private Long id;

    private Long categoryId;

    private String title;

    @ApiModelProperty(value = "Thematic main image")
    private String pic;

    @ApiModelProperty(value = "Number of associated products")
    private Integer productCount;

    private Integer recommendStatus;

    private Date createTime;

    private Integer collectCount;

    private Integer readCount;

    private Integer commentCount;

    @ApiModelProperty(value = "Album pictures are separated by commas")
    private String albumPics;

    private String description;

    @ApiModelProperty(value = "Display status: 0->no display; 1->display")
    private Integer showStatus;

    @ApiModelProperty(value = "number of forwarding")
    private Integer forwardCount;

    @ApiModelProperty(value = "Thematic category name")
    private String categoryName;

    private String content;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CmsSubject{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", title='" + title + '\'' +
                ", pic='" + pic + '\'' +
                ", productCount=" + productCount +
                ", recommendStatus=" + recommendStatus +
                ", createTime=" + createTime +
                ", collectCount=" + collectCount +
                ", readCount=" + readCount +
                ", commentCount=" + commentCount +
                ", albumPics='" + albumPics + '\'' +
                ", description='" + description + '\'' +
                ", showStatus=" + showStatus +
                ", forwardCount=" + forwardCount +
                ", categoryName='" + categoryName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}