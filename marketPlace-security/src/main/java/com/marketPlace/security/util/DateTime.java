/*
 *
 * Copyright (c)  created on 25/01/21, 4:06 PM , 2021. by Akshay Babbar
 *
 *
 */

package com.marketPlace.security.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateTime extends Date {
    private boolean mutable;
    private Week firstDayOfWeek;
    private TimeZone timeZone;

    public DateTime(Date date) {

    }

    public DateTime offset(DateField datePart, int offset) {
        if (DateField.ERA == datePart) {
            throw new IllegalArgumentException("ERA is not support offset!");
        } else {
            Calendar cal = this.toCalendar();
            cal.add(datePart.getValue(), offset);
            DateTime dt = this.mutable ? this : this;
            return dt.setTimeInternal(cal.getTimeInMillis());
        }
    }

    public Calendar toCalendar() {
        return this.toCalendar(Locale.getDefault(Locale.Category.FORMAT));
    }

    public Calendar toCalendar(Locale locale) {
        return this.toCalendar(this.timeZone, locale);
    }

    public Calendar toCalendar(TimeZone zone) {
        return this.toCalendar(zone, Locale.getDefault(Locale.Category.FORMAT));
    }

    public Calendar toCalendar(TimeZone zone, Locale locale) {
        if (null == locale) {
            locale = Locale.getDefault(Locale.Category.FORMAT);
        }

        Calendar cal = null != zone ? Calendar.getInstance(zone, locale) : Calendar.getInstance(locale);
        cal.setFirstDayOfWeek(this.firstDayOfWeek.getValue());
        cal.setTime(this);
        return cal;
    }

    private DateTime setTimeInternal(long time) {
        super.setTime(time);
        return this;
    }
}
