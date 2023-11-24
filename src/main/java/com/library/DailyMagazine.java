package com.library;

public class DailyMagazine extends Magazine {
    private final String publicationDate;
    private final String genre;
    private final int number;


    public DailyMagazine(String title, String publisher, int ageRating, String copyEditor, String isnn, String publicationDate, String genre, int number) {
        super(title, publisher, ageRating, copyEditor, isnn);
        this.publicationDate = publicationDate;
        this.genre = genre;
        this.number = number;
    }

    public String getOverviewItemText(){
        return getOverviewItemText(number);
    }
}
