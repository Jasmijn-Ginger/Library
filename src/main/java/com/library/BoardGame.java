package com.library;

public class BoardGame extends Game {

    private final String designer;
    protected BoardGame(String title, String publisher, String yearOfPublication, String genre, String ean, int amountOfPlayers, int ageRating, String designer) {
        super(title, publisher, yearOfPublication, ageRating, genre, ean, amountOfPlayers);
        this.designer = designer;
    }
}
