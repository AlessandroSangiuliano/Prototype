package com.slx.prototype.enums;

public enum HoursDefinition
{
    FIRST_HOUR  ("8:00 - 8:50"),
    SECOND_HOUR ("8:50 - 9:50"),
    THIRD_HOUR ("9:50 - 10:50"),
    FOURTH_HOUR ("10:50 - 11:50"),
    FIFTH_HOUR ("11:50 - 12:50"),
    SIXTH_HOUR ("12:50 - 13:40"),
    SEVENTH_HOUR ("13:40 - 14:30"),
    EIGHT_HOUR ("14-30 - 15:20");

    public final String value;

    private HoursDefinition(String value)
    {
        this.value = value;
    }

}
