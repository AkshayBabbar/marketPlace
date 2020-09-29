package com.marketPlace.portal.controller;


import com.marketPlace.portal.service.OmsCartItemService;
import com.marketPlace.portal.service.UmsMemberService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(tags = "OmsCartItemController", description = "Shopping cart management")

@RequestMapping("/cart")
public class OmsCartItemController {

    @Autowired
    private OmsCartItemService cartItemService;

    @Autowired
    private UmsMemberService memberService;

}
