package com.library;

public class ComputerGame extends Game {
    private final String studio;
    protected ComputerGame(String title, String publisher, String yearOfPublication, String genre, String ean, int ageRating, int amountOfPlayers, String studio) {
        super(title, publisher, yearOfPublication, ageRating, genre, ean, amountOfPlayers);
        this.studio = studio;
    }
}
