/*
 *
 * Copyright (c)  created on 25/01/21, 4:06 PM , 2021. by Akshay Babbar
 *
 *
 */

package com.marketPlace.security.util;

import java.util.Date;

public class DateUtil {
    private static final String[] wtb = new String[]{"sun", "mon", "tue", "wed", "thu", "fri", "sat", "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec", "gmt", "ut", "utc", "est", "edt", "cst", "cdt", "mst", "mdt", "pst", "pdt"};


    public DateUtil() {
    }


    public static DateTime dateNew(Date date) {
        return new DateTime(date);
    }

    public static DateTime offset(Date date, DateField dateField, int offset) {
        return dateNew(date).offset(dateField, offset);
    }

    public static DateTime offsetSecond(Date date, int offset) {
        return offset(date, DateField.SECOND, offset);
    }
}
