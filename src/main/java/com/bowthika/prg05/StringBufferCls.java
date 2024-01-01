package com.bowthika.prg05;

public class StringBufferCls{
    StringBuffer str;
    public void settStr(String inputStr){
        this.str = new StringBuffer(inputStr);
    }
    public int getLength(){
        return str.length();
    }
    public int getCapacity(){
        return str.capacity();
    }
}
