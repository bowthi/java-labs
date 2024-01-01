package com.bowthika.prg04;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringMethodsTest {
    StringMethods obj ;
    public StringMethodsTest(){
        obj=new StringMethods();
    }
    @Test
    public void getUpperString(){
        String output =obj.getUpperString();
        String expected="ANU";
        assertEquals(expected,output);
    }
    public void getLowerString(){
        String output =obj.getLowerString();
        String expected="anu";
        assertEquals(expected,output);
    }





}
