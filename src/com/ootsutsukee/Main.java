package com.ootsutsukee;

public class Main {

    public static void main(String[] args) {
        TelegramChannel countryBalls = new TelegramChannel("country balls");
        countryBalls.subscribe(new TelegramSubscriber("Akbota"));
        countryBalls.subscribe(new TelegramSubscriber("Michael"));
        countryBalls.subscribe(new TelegramSubscriber("Doge"));

        countryBalls.notifyAll("new java version");

        countryBalls.notifyAll("new anime");

    }
}
