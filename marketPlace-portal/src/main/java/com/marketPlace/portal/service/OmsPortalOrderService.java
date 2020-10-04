package com.marketPlace.portal.service;

import com.marketPlace.commons.domain.CommonPage;
import com.marketPlace.portal.entity.epc.ConfirmOrderResult;
import com.marketPlace.portal.entity.oms.OmsOrderDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author Akshay Babbar
 * Front Office Order Management Service
 */

public interface OmsPortalOrderService {

    /**
     * Generate confirmation form information based on user shopping cart information
     *
     * @param cartIds
     */
    ConfirmOrderResult generateConfirmOrder(List<Long> cartIds);

    /**
     * Generate order based on submitted information
     */
    @Transactional
    Map<String, Object> generateOrder(OrderParam orderParam);

    /**
     * Callback after successful payment
     */
    @Transactional
    Integer paySuccess(Long orderId, Integer payType);

    /**
     * Automatically cancel overtime orders
     */
    @Transactional
    Integer cancelTimeOutOrder();

    /**
     * Cancel a single overtime order
     */
    @Transactional
    void cancelOrder(Long orderId);

    /**
     * Send delayed message to cancel order
     */
    void sendDelayMessageCancelOrder(Long orderId);

    /**
     * Confirm receipt
     */
    void confirmReceiveOrder(Long orderId);

    /**
     * Paging to get user orders
     */
    CommonPage<OmsOrderDetail> list(Integer status, Integer pageNum, Integer pageSize);

    /**
     * Get order details based on order ID
     */
    OmsOrderDetail detail(Long orderId);

    /**
     * The user deletes the order based on the order ID
     */
    void deleteOrder(Long orderId);
}
