package com.movistar.mx.interactions;


import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.movistar.mx.driver.AppiumAndroidDriver.driver;
import static com.movistar.mx.userinterfaces.HomeUI.BTN_POPUP;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Scroll implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {


        TouchAction touchAction = new TouchAction(driver);
        try {
            Thread.sleep(1000);
            touchAction.longPress(PointOption.point(220, 996));


            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        touchAction.moveTo(PointOption.point(856, 998));


        touchAction.release();


        touchAction.perform();
    }

    public static Performable go() {
        return Instrumented.instanceOf(Scroll.class).withProperties();
    }
}

