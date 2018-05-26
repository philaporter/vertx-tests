package com.philaporter;

import io.vertx.core.Vertx;

public class Main {

    public void thisthat() {
        Vertx.currentContext().owner().eventBus().consumer("place", data -> {
            System.out.println(data.body());
        });
        Vertx.currentContext().owner().eventBus().publish("place", "details");
    }

    public void somethingelse() {
        long value = Vertx.currentContext().owner().setPeriodic(5000, handle -> {
            System.out.println("Inside that timer thingy");
        });
    }
}
