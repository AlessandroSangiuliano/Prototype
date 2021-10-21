package com.slx.prototype;

import java.time.DayOfWeek;
import java.util.List;

public class Day
{

    DayOfWeek dayName;
    List<Hour> hours;

    public Day(DayOfWeek aDay, List<Hour> hours)
    {
        this.dayName = aDay;
        this.hours = hours;
    }

    

    /*** ACCESSORS ***/

    public DayOfWeek getDayName()
    {
        return dayName;
    }

    public void setDayName(DayOfWeek dayName)
    {
        this.dayName = dayName;
    }

    public List<Hour> getHours()
    {
        return hours;
    }

    public void setHours(List<Hour> hours)
    {
        this.hours = hours;
    }
}
