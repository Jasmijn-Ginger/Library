package com.library;

public class ItemStatus {
    public String status = "Beschikbaar";

    public void leenItem(){
        status = "Uitgeleend";
    }

    public void retourneerItem(){
        status = "Beschikbaar";
    }
}
