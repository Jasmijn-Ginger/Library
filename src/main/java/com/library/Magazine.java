package com.library;

public abstract class Magazine extends ItemStatus{
    private final String title;
    private final String publisher;
    private final int ageRating;
    private final String copyEditor;
    private final String isnn;

    public Magazine(String title, String publisher, int ageRating, String copyEditor, String isnn) {
        this.title = title;
        this.publisher = publisher;
        this.ageRating = ageRating;
        this.copyEditor = copyEditor;
        this.isnn = isnn;
    }

    public String getOverviewItemText(int number){
        return isnn + title + number + status;
    }
}
