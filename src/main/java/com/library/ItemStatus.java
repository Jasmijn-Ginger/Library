package com.library;

public class ItemStatus {
    private String status = "Beschikbaar";

    public void leenItem(){
        status = "Uitgeleend";
    }

    public void retourneerItem(){
        status = "Beschikbaar";
    }

    public String getStatus(){
        return status;
    }
}
