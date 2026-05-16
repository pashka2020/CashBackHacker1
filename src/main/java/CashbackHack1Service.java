package ru.netology.service;

public class CashbackHack1Service {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}