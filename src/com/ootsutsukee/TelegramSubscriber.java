package com.ootsutsukee;

public class TelegramSubscriber implements Listener{
    private String name;

    public TelegramSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("I am " + name + " and I read about " + news);
    }
}
