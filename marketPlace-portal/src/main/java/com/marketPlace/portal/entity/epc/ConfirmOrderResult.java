package com.marketPlace.portal.entity.epc;

import com.marketPlace.portal.entity.uams.UmsMemberReceiveAddress;

import java.util.List;

public class ConfirmOrderResult {
    private List<CartPromotionItem> cartPromotionItemsList;
    private List<UmsMemberReceiveAddress> memberReceiveAddressList;
    private List<SmsCouponHistoryDetail> couponHistoryDetailList;
}
