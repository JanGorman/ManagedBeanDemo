package com.schnaub.managed;

import io.dropwizard.lifecycle.Managed;

import java.util.Timer;
import java.util.TimerTask;

public class Foo implements Managed {

    private final Timer timer;

    public Foo() {
        timer = new Timer();
    }

    @Override
    public void start() throws Exception {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("yey");
            }
        }, 0, 5000);
    }

    @Override
    public void stop() throws Exception {
        timer.cancel();
    }
}
