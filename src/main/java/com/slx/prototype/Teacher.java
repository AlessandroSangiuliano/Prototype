package com.slx.prototype;


public class Teacher extends Person
{
    String discipline;
    Boolean availability;

    public Teacher(String name, String lastName)
    {
        super(name, lastName);
        availability = true;
    }

    public Teacher(String name, String lastName, String discipline)
    {
        super(name, lastName);
        this.discipline = discipline;
        availability = true;
    }


    /*** ACCESSORS ***/

    public String getDiscipline()
    {
        return discipline;
    }

    public void setDiscipline(String discipline)
    {
        this.discipline = discipline;
    }

    public Boolean getAvailability()
    {
        return availability;
    }

    public void setAvailability(Boolean availability)
    {
        this.availability = availability;
    }
}
