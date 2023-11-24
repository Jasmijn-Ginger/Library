package com.library;

public class Book extends ItemStatus{
    private final String title;
    private final String publisher;
    private final int yearOfPublication;
    private final String genre;
    private final int ageRating;
    private final String isbn;
    private final String copyEditor;
    private final String author;

    public Book(String title, String publisher, int yearOfPublication, String genre, int ageRating, String isbn, String copyEditor, String author) {
        this.title = title;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
        this.ageRating = ageRating;
        this.isbn = isbn;
        this.copyEditor = copyEditor;
        this.author = author;
    }

    protected String getOverviewItemText(){
        return isbn + title + author + yearOfPublication + status;
    }
}
