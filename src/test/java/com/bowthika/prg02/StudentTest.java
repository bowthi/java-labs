package com.bowthika.prg02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
    @Test
    public void Testcase01(){
        student object = new student();
        
         String outputname=object.getname();
         String outputaddress=object.getaddress();
         String expectedname="Bowthi";
         String expectedaddress="Erode";
         assertEquals(expectedname,outputname);
         assertEquals(expectedaddress,outputaddress);

    }
    

}
