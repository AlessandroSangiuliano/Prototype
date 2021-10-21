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
        String bExpected = "10:50";
        String eExpected = "11:50";

        Hour hour = new Hour(HoursDefinition.FOURTH_HOUR);

        assertEquals(10, hour.getBegins().getHour());
        assertEquals(50, hour.getBegins().getMinute());
        assertEquals(11, hour.getEnds().getHour());
        assertEquals(50, hour.getEnds().getMinute());
        assertEquals(bExpected, hour.getBegins().toString());
        assertEquals(eExpected, hour.getEnds().toString());

    }

}