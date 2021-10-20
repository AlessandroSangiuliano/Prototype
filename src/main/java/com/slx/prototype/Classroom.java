package com.slx.prototype;

import java.util.ArrayList;
import java.util.List;

public class Classroom extends Room
{
    String className;
    List<Student> students;

    public Classroom(String className, String roomID, Student student)
    {
        super(roomID);
        students = new ArrayList<Student>();
        this.className = className;
        students.add(student);
    }

    public Classroom(String className, String roomID, List<Student> studentsList)
    {
        super(roomID);
        this.className = className;
        students = studentsList;
    }

    /*** ACCESSORS ***/

    public String getClassName()
    {
        return className;
    }

    public void setClassName(String className)
    {
        this.className = className;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public void setStudents(List<Student> students)
    {
        this.students = students;
    }
}
