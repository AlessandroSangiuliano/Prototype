package com.slx.prototype;

import com.slx.prototype.enums.HoursDefinition;

import java.time.LocalTime;


public class Hour
{
    LocalTime begins;
    LocalTime ends;

    public Hour(HoursDefinition hour)
    {
        String[] splits = hour.value.split("-");
        this.begins = LocalTime.parse(splits[0].strip());
        this.ends = LocalTime.parse(splits[1].strip());;
    }

    /*** ACCESSORS ***/

    public LocalTime getBegins()
    {
        return begins;
    }

    public void setBegins(LocalTime begins)
    {
        this.begins = begins;
    }

    public LocalTime getEnds()
    {
        return ends;
    }

    public void setEnds(LocalTime ends)
    {
        this.ends = ends;
    }
}
