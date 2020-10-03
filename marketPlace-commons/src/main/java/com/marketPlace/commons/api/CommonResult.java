package com.marketPlace.commons.api;

import org.springframework.http.HttpStatus;

/**
 * @author Akshay Babbar
 */

public class CommonResult<T> {
    private int code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
    }

    public static <T> CommonResult<T> failed(HttpStatus code, String message) {
        return new CommonResult<T>(code.value(), message, null);
    }

    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(HttpStatus.INTERNAL_SERVER_ERROR.value(), message, null);
    }

    public static <T> CommonResult<T> failed() {
        return failed(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
    }

    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<>(HttpStatus.NOT_FOUND.value(), message, null);
    }

    public static <T> CommonResult<T> unauthorised(T data) {
        return new CommonResult<T>(HttpStatus.UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.getReasonPhrase(), data);
    }

    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(HttpStatus.FORBIDDEN.value(), HttpStatus.FORBIDDEN.getReasonPhrase(), data);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
