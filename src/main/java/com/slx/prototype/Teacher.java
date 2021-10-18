package com.slx.prototype;


public class Teacher extends Person
{
    String discipline;


    public Teacher(String name, String lastName)
    {
        super(name, lastName);
    }

    public Teacher(String name, String lastName, String discipline)
    {
        super(name, lastName);
        this.discipline = discipline;
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
}
