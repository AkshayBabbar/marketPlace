package com.marketPlace.portal.entity.oms;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsOrder implements Serializable {

    private Long id;

    private Long memberId;

    private Long couponId;

    @ApiModelProperty(value = "Order id")
    private String orderId;
    @ApiModelProperty(value = "Submission time")
    private Date createTime;
    private Date modifiedTime;
    private Date endTime;

    @ApiModelProperty(value = "user account")
    private String userName;
    @ApiModelProperty(value = "Total order amount")
    private BigDecimal totalAmount;
    @ApiModelProperty(value = "Amount payable (Amount actually paid)")
    private BigDecimal payAmount;

    private BigDecimal discountAmount;

    private BigDecimal reducedAmount;

    private Integer payType;

    private Integer status;

    private Integer orderType;

    @ApiModelProperty(value = "Activity Information")
    private String promotionInfo;

    @ApiModelProperty(value = "Invoice type: 0->no invoice; 1->electronic invoice; 2->paper invoice")
    private Integer billType;

    @ApiModelProperty(value = "Invoice header")
    private String billHeader;

    @ApiModelProperty(value = "Invoice content")
    private String billContent;

    @ApiModelProperty(value = "Receiver Phone")
    private String billReceiverPhone;

    @ApiModelProperty(value = "receiver mailbox")
    private String billReceiverEmail;

    @ApiModelProperty(value = "Consignee Name")
    private String receiverName;

    @ApiModelProperty(value = "Consignee phone")
    private String receiverPhone;

    @ApiModelProperty(value = "Consignee Zip Code")
    private String receiverPostCode;

    @ApiModelProperty(value = "Province/City")
    private String receiverProvince;

    @ApiModelProperty(value = "City")
    private String receiverCity;

    @ApiModelProperty(value = "area")
    private String receiverRegion;

    @ApiModelProperty(value = "detailed address")
    private String receiverDetailAddress;

    @ApiModelProperty(value = "Order Remarks")
    private String note;

    @ApiModelProperty(value = "Confirm receipt status: 0->unconfirmed; 1->confirmed")
    private Integer confirmStatus;

    @ApiModelProperty(value = "Deletion status: 0->not deleted; 1->deleted")
    private Integer deleteStatus;

    @ApiModelProperty(value = "Points used when placing an order")
    private Integer useIntegration;

    @ApiModelProperty(value = "Payment Time")
    private Date paymentTime;

    @ApiModelProperty(value = "delivery time")
    private Date deliveryTime;

    @ApiModelProperty(value = "Confirm the delivery time")
    private Date receiveTime;


}
