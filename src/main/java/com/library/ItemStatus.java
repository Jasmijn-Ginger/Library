package com.library;

public class ItemStatus {
    public static String status = "Beschikbaar";

    public static void leenItem(){
        status = "Uitgeleend";
    }

    public static void retourneerItem(){
        status = "Beschikbaar";
    }
}
