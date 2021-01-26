/*
 *
 * Copyright (c)  created on 25/01/21, 4:06 PM , 2021. by Akshay Babbar
 *
 *
 */

package com.marketPlace.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

//TODO: Need to check configuration properties.

@Getter
@Setter
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {
    private List<String> urls = new ArrayList<>();

}