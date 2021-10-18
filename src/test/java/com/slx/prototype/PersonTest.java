package com.slx.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest
{

    @Test
    public void GetterTest()
    {
        String expectedName = "Ciccio";
        Person p1 = new Person("Ciccio", "Pasticco");

        assertEquals(expectedName, p1.name);
    }
}