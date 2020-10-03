package com.marketPlace.portal.entity.uams;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class UmsMemberReceiveAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long memberId;
    @ApiModelProperty(value = "Consignee Name")
    private String name;
    private String phoneName;
    private Integer defaultStatus;
    @ApiModelProperty(value = "Postal Code")
    private String postCode;
    @ApiModelProperty(value = "province/municipalities")
    private String province;
    @ApiModelProperty(value = "city")
    private String city;
    @ApiModelProperty(value = "area")
    private String region;
    @ApiModelProperty(value = "Detailed address (street)")
    private String detailAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    public String toString() {
        return "UmsMemberReceiveAddress{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", name='" + name + '\'' +
                ", phoneName='" + phoneName + '\'' +
                ", defaultStatus=" + defaultStatus +
                ", postCode='" + postCode + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", detailAddress='" + detailAddress + '\'' +
                '}';
    }
}
