package com.slx.prototype;

import java.time.LocalTime;


public class Hour
{
    LocalTime begins;
    LocalTime ends;

    public Hour(LocalTime hBegins, LocalTime hEnds)
    {
        this.begins = hBegins;
        this.ends = hEnds;
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
