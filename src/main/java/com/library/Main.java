package com.library;

public class Main {
    public static void main(String[] args) {
       BoardGame catan = new BoardGame("Catan", "GameManufacturer", "2000", "Strategy", "2" +
               "5514", 2, 14, "Niceperson");

        System.out.println(catan.status);
        catan.leenItem();
        System.out.println(catan.status);
        catan.retourneerItem();
        System.out.println(catan.status);

        System.out.println(catan.getOverviewItemText());

        Book overtherainbow = new Book("Over The Rainbow", "John Doe", 2023, "childrensbook", 3, "245698753", "copy", "Jane Smith");
        overtherainbow.leenItem();
        System.out.println(overtherainbow.getOverviewItemText());

    }
}
