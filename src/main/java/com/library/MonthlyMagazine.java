package com.library;

public class MonthlyMagazine extends Magazine {
    private final String yearOfPublication;
    private final String name;
    private final int monthNumber;
    private final String appearance;
    public MonthlyMagazine(String title, String publisher, int ageRating, String copyEditor, String isnn, String yearOfPublication, String name, int monthNumber, String appearance) {
        super(title, publisher, ageRating, copyEditor, isnn);
        this.yearOfPublication = yearOfPublication;
        this.name = name;
        this.monthNumber = monthNumber;
        this.appearance = appearance;
    }

    public String getOverviewItemText(){
        return getOverviewItemText(monthNumber);
    }
}
