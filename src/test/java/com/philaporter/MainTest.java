package com.philaporter;

import io.vertx.core.Vertx;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(VertxUnitRunner.class)
public class MainTest {

    private Main main;

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @Before
    public void setup() {
        Vertx vertx = rule.vertx();
        main = new Main();
    }

    @Test
    public void testSomething(TestContext context) {
        main.thisthat();
    }

    @Test
    public void testThatOtherThing(TestContext context) {
        main.somethingelse();
    }

}
