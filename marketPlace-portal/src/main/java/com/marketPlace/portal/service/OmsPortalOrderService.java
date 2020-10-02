package com.marketPlace.portal.service;

import com.marketPlace.portal.entity.epc.ConfirmOrderResult;

import java.util.List;

public interface OmsPortalOrderService {

    ConfirmOrderResult generateConfirmOrder(List<Long> cartIds);
}
