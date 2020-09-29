package com.marketPlace.portal.entity.epc;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class PmsProductAttributes implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Long productAttributeCategoryId;
    @ApiModelProperty(value = "Property selection type: 0->only; 1->single selection; 2->multiple selection")
    private Integer selectType;
    @ApiModelProperty(value = "Attribute entry method: 0->manual entry; 1->select from the list")
    private Integer inputType;
    @ApiModelProperty(value = "A list of optional values, separated by commas")
    private String inputList;
    @ApiModelProperty(value = "Sort field: the highest can upload pictures separately")
    private Integer sort;
    @ApiModelProperty(value = "Classification filtering style: 1->Normal; 1->Color")
    private Integer filterType;
    @ApiModelProperty(value = "Search type; 0->no need to search; 1->keyword search; 2->range search")
    private Integer searchType;
    @ApiModelProperty(value = "Whether the products with the same attribute are related; 0->not related; 1->related")
    private Integer relatedStatus;
    @ApiModelProperty(value = "Do you support manual addition; 0->not supported; 1->supported")
    private Integer handAddStatus;
    @ApiModelProperty(value = "Property type; 0->specification; 1->parameter")
    private Integer type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    public Integer getSelectType() {
        return selectType;
    }

    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    public String getInputList() {
        return inputList;
    }

    public void setInputList(String inputList) {
        this.inputList = inputList;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public Integer getRelatedStatus() {
        return relatedStatus;
    }

    public void setRelatedStatus(Integer relatedStatus) {
        this.relatedStatus = relatedStatus;
    }

    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "PmsProductAttributes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productAttributeCategoryId=" + productAttributeCategoryId +
                ", selectType=" + selectType +
                ", inputType=" + inputType +
                ", inputList='" + inputList + '\'' +
                ", sort=" + sort +
                ", filterType=" + filterType +
                ", searchType=" + searchType +
                ", relatedStatus=" + relatedStatus +
                ", handAddStatus=" + handAddStatus +
                ", type=" + type +
                '}';
    }
}
