package com.bowthika.prg08;

public class Multithread extends Thread{
    public void run(){
        try
            {
                System.out.println("Thread "+Thread.currentThread().threadId()+" is running");
            }
        catch (Exception e)
            {
                System.out.println("Exception is Caught");      
            }
    }
}
