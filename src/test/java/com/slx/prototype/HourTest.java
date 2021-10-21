package com.slx.prototype;

import com.slx.prototype.enums.HoursDefinition;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class HourTest
{
    @Test
    public void GENERIC_CLASS_TEST()
    {
        LocalTime beginTime = LocalTime.parse("10:50:00");
        LocalTime endTimes = LocalTime.parse("11:50:00");

        String bExpected = "10:50";
        String eExpected = "11:50";

        Hour hour = new Hour(beginTime, endTimes);

        assertEquals(10, hour.getBegins().getHour());
        assertEquals(50, hour.getBegins().getMinute());
        assertEquals(11, hour.getEnds().getHour());
        assertEquals(50, hour.getEnds().getMinute());
        assertEquals(bExpected, beginTime.toString());
        assertEquals(eExpected, endTimes.toString());

    }

}