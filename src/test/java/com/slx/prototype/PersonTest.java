package com.slx.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest
{

    @Test
    public void TEST_GETTER()
    {
        String expectedName = "Ciccio";
        Person p1 = new Person("Ciccio", "Pasticco");

        assertEquals(expectedName, p1.name);
    }

    @Test
    public void TEST_TECHNICAL_ASSISTANT()
    {
        TechnicalAssistant ta = new TechnicalAssistant("Ciccio", "Pasticcio");

        String name = "Ciccio";

        assertEquals(name, ta.name);
    }

}