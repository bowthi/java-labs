package com.bowthika.prg07;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Class1Test {
    Class1 obj;
    public  Class1Test(){
        obj = new Class1();
    }

    @Test
    public void printableTest(){
        String output = obj.print();
        String expected = "Hello";
        assertEquals(output , expected);
    }
    @Test
    public void showableTest(){
        String output = obj.show();
        String expected = "World";
        assertEquals(output , expected);
    }
}
