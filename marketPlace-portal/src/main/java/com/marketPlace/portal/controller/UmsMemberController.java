package com.marketPlace.portal.controller;

import com.marketPlace.portal.service.UmsMemberService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(tags = "UMSMemberController")
@RequestMapping("/sso")
public class UmsMemberController {

    private String tokenHeader;

    private String tokenHead;

    @Autowired
    private UmsMemberService memberService;

}
