package com.bowthika.prg08;

public class Threadloop {
    public static void main(String[] args) {
        
        int n = 8;
        for(int i=0;i<n;i++){
            Multithread obj = new Multithread();
            obj.start();
        }
    }
}
