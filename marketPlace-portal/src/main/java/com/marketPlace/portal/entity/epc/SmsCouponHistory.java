package com.marketPlace.portal.entity.epc;

import io.swagger.annotations.ApiParam;

import java.io.Serializable;
import java.util.Date;

public class SmsCouponHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Long memberId;
    private String couponCode;
    private Date createTime;
    @ApiParam(value = "Used Time for Coupon")
    private Date useTime;
    @ApiParam(value = "Used Status for Coupon: 0->unused; 1->used; 2->expired")
    private Integer useStatus;
    private Date endTime;
    @ApiParam(value = "Order Id for this Coupon")
    private Long orderId;

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

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "SmsCouponHistory{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", couponCode='" + couponCode + '\'' +
                ", createTime=" + createTime +
                ", useTime=" + useTime +
                ", useStatus=" + useStatus +
                ", endTime=" + endTime +
                ", orderId=" + orderId +
                '}';
    }
}
