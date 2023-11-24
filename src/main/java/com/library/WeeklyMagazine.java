package com.library;

public class WeeklyMagazine extends Magazine {
    private final int yearOfPublication;
    private final String genre;
    private final int weekNumber;

    public WeeklyMagazine(String title, String publisher, int ageRating, String copyEditor, String isnn, int yearOfPublication, String genre, int weekNumber) {
        super(title, publisher, ageRating, copyEditor, isnn);
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
        this.weekNumber = weekNumber;
    }

    public String getOverviewItemText(){
        return getOverviewItemText(weekNumber);
    }
}
