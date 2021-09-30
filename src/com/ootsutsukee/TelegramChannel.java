package com.ootsutsukee;

import java.util.ArrayList;
import java.util.List;

public class TelegramChannel {
    private String name;

    List<Listener> list;

    public TelegramChannel(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    public void subscribe (Listener listener) {
        list.add(listener);
    }

    public void unsubscribe (Listener listener) {
        list.remove(listener);
    }

    public void notifyAll(String news) {
        System.out.println(name + " started notifying all subscribers");
        for (Listener l : list) {
            l.update(news);
        }
        System.out.println();
    }
}
