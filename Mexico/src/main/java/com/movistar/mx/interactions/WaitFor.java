package com.movistar.mx.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.concurrent.TimeUnit;

import static com.movistar.mx.driver.AppiumAndroidDriver.driver;


public class WaitFor implements Interaction {

    private int seconds;

    public WaitFor(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static Performable thisSeconds(int seconds)
    {
        return Instrumented.instanceOf(WaitFor.class).withProperties(seconds);
    }
}