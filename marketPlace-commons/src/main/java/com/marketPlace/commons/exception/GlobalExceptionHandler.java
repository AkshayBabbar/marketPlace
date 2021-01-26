/*
 *
 * Copyright (c)  created on 25/01/21, 4:06 PM , 2021. by Akshay Babbar
 *
 *
 */

package com.marketPlace.commons.exception;

import com.marketPlace.commons.api.CommonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


//TODO:     @Controller Advice and Advice and Exception Handler. Need to see the Global Exception Handler also.


@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler
    public CommonResult handle(ApiException e) {
        if (e.getErrorCode() != null) {
            return CommonResult.failed(e.getErrorCode());
        }
        return CommonResult.failed(e.getMessage());
    }

}
