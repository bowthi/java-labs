package com.bowthika.prg06;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClassMultilevelTest {
    Class3 obj;
    public ClassMultilevelTest(){
        obj = new Class3();
    }

    @Test
    public void print1Test(){
        String output=obj.print1();
        String expected="Grand Parent";
        assertEquals(expected , output);

    }
    @Test
    public void print2Test(){
        String output=obj.print2();
        String expected="Parent";
        assertEquals(expected , output);

    }
    @Test
    public void print3Test(){
        String output=obj.print3();
        String expected="Child";
        assertEquals(expected , output);

    }

}
