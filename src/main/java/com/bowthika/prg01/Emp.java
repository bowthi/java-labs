package com.bowthika.prg01;

public class Emp {
    int id;
    String name;
    String address;

    public void putdata(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getdata(){
        return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
}

