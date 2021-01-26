/*
 *
 * Copyright (c)  created on 25/01/21, 4:06 PM , 2021. by Akshay Babbar
 *
 *
 */

package com.marketPlace.security.util;

public enum Week {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int value;

    private Week(int value) {
        this.value = value;
    }

    public static Week of(int calendarWeekIntValue) {
        switch (calendarWeekIntValue) {
            case 1:
                return SUNDAY;
            case 2:
                return MONDAY;
            case 3:
                return TUESDAY;
            case 4:
                return WEDNESDAY;
            case 5:
                return THURSDAY;
            case 6:
                return FRIDAY;
            case 7:
                return SATURDAY;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }

    public String toChinese() {
        return this.toChinese("星期");
    }

    public String toChinese(String weekNamePre) {
        switch (this) {
            case SUNDAY:
                return weekNamePre + "日";
            case MONDAY:
                return weekNamePre + "一";
            case TUESDAY:
                return weekNamePre + "二";
            case WEDNESDAY:
                return weekNamePre + "三";
            case THURSDAY:
                return weekNamePre + "四";
            case FRIDAY:
                return weekNamePre + "五";
            case SATURDAY:
                return weekNamePre + "六";
            default:
                return null;
        }
    }
}

