/*
 *
 * Copyright (c)  created on 25/01/21, 4:06 PM , 2021. by Akshay Babbar
 *
 *
 */

package com.marketPlace.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * @author Akshay Babbar
 * @date 14/10/2020
 * Dynamic Permission related to business.
 */

//TODO: Need to Search About DYNAMIC Security Service

public interface DynamicSecurityService {

    Map<String, ConfigAttribute> loadDataSource();

}
