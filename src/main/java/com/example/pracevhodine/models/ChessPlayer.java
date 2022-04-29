package com.example.pracevhodine.models;

public class ChessPlayer {

    private String name;
    private String federation;
    private Gender gender;
    private int yearOfBirth;

    public ChessPlayer(String name, String federation, Gender gender, int yearOfBirth) {
        this.name = name;
        this.federation = federation;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getFederation() {
        return federation;
    }

    public Gender getGender() {
        return gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
