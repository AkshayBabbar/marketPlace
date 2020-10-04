package com.marketPlace.portal.entity.oms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class OrderParam {

    @ApiModelProperty("Receiving Address ID")
    private Long memberReceiveAddressId;
    @ApiModelProperty("Coupon ID")
    private Long couponId;
    @ApiModelProperty("Number of points used")
    private Integer useIntegration;
    @ApiModelProperty("Payment Method")
    private Integer payType;
    @ApiModelProperty("Selected shopping cart product ID")
    private List<Long> cartIds;

}
