package com.bowthika.prg01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmpTest {
    
    @Test
    public void test01(){
        Emp e = new Emp();
        e.putdata(01,"Anu","Erode");
        String output = e.getdata();
        String expected ="Emp [id=1, name=Anu, address=Erode]";
        assertEquals(expected, output);
    }
     @Test
    public void test02(){
        Emp e = new Emp();
        e.putdata(01,"Bowthi","Erode");
        String output = e.getdata();
        String expected ="Emp [id=1, name=Bowthi, address=Erode]";
        assertEquals(expected, output);
    }

}
