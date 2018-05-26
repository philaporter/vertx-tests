package com.philaporter;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    public void start() throws Exception {
        System.out.println("MainVerticle");
        Main main = new Main();
        main.somethingelse();
        main.thisthat();
        if(1<3) throw new Exception();
    }
}
