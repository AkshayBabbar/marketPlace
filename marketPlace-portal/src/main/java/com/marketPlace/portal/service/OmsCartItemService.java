package com.marketPlace.portal.service;

import com.marketPlace.portal.entity.epc.CartProduct;
import com.marketPlace.portal.entity.epc.CartPromotionItem;
import com.marketPlace.portal.entity.oms.OmsCartItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Akshay Babbar
 * <p>
 * Shopping Cart Management Service.
 */
public interface OmsCartItemService {
    /**
     * Query whether the product is included in the shopping cart, there is an increase in the quantity, and no addition to the shopping cart
     */
    @Transactional
    int add(OmsCartItem cartItem);

    /**
     * Get the shopping cart list according to the member ID
     */
    List<OmsCartItem> list(Long memberID);

    /**
     * Get a list of shopping carts containing promotion information
     */
    List<CartPromotionItem> listPromotion(Long memberId, List<Long> cartIds);

    /**
     * Modify the quantity of a shopping cart
     */
    int updateQuantity(Long id, Long memberId, Integer quantity);

    /**
     * Delete items in the shopping cart in bulk
     */
    int delete(Long memberId, List<Long> ids);

    /**
     * Get product information used to select product specifications in the shopping cart
     */
    CartProduct getCartProduct(Long productId);

    /**
     * Modify the specifications of the goods in the shopping cart
     */
    @Transactional
    int updateAttr(OmsCartItem cartItem);

    /**
     * Empty the shopping cart
     */
    int clear(Long memberId);

}
