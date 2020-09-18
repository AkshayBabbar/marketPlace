package com.marketPlace.portal.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class PmsPorduct implements Serializable {
    private Long id;
    private Long brandid;
    private Long productAttributeId;
    private String name;

    @ApiModelProperty(value = "Item No.")
    private String productSn;

    @ApiModelProperty(value = "Delete status: 0->not deleted; 1->deleted")
    private Integer deleteStatus;
    @ApiModelProperty(value = "Shelf status: 0->off shelf; 1->on shelf")
    private Integer publishStatus;


}
