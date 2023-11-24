package com.library;

public abstract class Game extends ItemStatus {
    private final String title;
    private final String publisher;
    private final String yearOfPublication;
    private final int ageRating;
    private final String genre;
    private final String ean;
    private final int amountOfPlayers;


    protected Game(String title, String publisher, String yearOfPublication, int ageRating, String genre, String ean, int amountOfPlayers) {
        this.title = title;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.ageRating = ageRating;
        this.genre = genre;
        this.ean = ean;
        this.amountOfPlayers = amountOfPlayers;
    }
}
