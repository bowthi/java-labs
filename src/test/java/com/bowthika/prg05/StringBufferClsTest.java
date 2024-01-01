package com.bowthika.prg05;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringBufferClsTest {
    StringBufferCls obj = new StringBufferCls();

    @Test
    public void getLengthTest(){
        obj.settStr("Geeks for Geeks");
        int output =obj.getLength();
        int expected=15;
        assertEquals(expected , output);
    }
    @Test
    public void getCapacityTest(){
        obj.settStr("Geeks for Geeks");
        int output =obj.getCapacity();
        int expected=31;
        assertEquals(expected , output);
    }
}
