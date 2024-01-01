package com.bowthika.prg03;

public class product {
    int pro_id;
    String pro_name;
    public product(int pro_id, String pro_name) {
        this.pro_id = pro_id;
        this.pro_name = pro_name;
    }
    public product(){
        
    };
    public String getdata() {
        return "product [pro_id=" + pro_id + ", pro_name=" + pro_name + "]";
    }
    
    

}
