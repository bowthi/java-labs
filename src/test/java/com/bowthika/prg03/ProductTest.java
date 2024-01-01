package com.bowthika.prg03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductTest {
    product [] obj;
    public ProductTest(){
         obj = new product[3];
         obj[0] =new product(1234,"Dell");
         obj[1] =new product(123,"lenovo");
         obj[2] =new product(12,"hp");
    }
   
    @Test
    public void getproduct01(){
        String output = obj[0].getdata();
        String expected = "product [pro_id=1234, pro_name=Dell]";
        assertEquals(expected,output);
    }
    public void getproduct02(){
        String output = obj[1].getdata();
        String expected = "product [pro_id=123, pro_name=Lenovo]";
        assertEquals(expected,output);
    }
     public void getproduct03(){
        String output = obj[2].getdata();
        String expected = "product [pro_id=12, pro_name=hp]";
        assertEquals(expected,output);
    }

}
