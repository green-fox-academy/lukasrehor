package com.greenfox.lukasrehor.BankOfSimba;

public class BankAccount {
    String name;
    long balance;
    String animalType;
    boolean king;
    boolean goodOne;

    public BankAccount(String name, long balance, String animalType, boolean king, boolean goodOne) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.goodOne = goodOne;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean getKing () {
        return king;
    }

    public boolean getGoodOne () {
        return goodOne;
    }
}
