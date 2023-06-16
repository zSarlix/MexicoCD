package com.movistar.mx.task;


import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.movistar.mx.driver.AppiumAndroidDriver.driver;
import static com.movistar.mx.userinterfaces.HomeUI.BTN_MENU;
import static com.movistar.mx.userinterfaces.HomeUI.BTN_SALIR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogoutTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                WaitUntil.the(BTN_MENU, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_MENU)
        );


       driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));


        actor.attemptsTo(
                WaitUntil.the(BTN_SALIR, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_SALIR)

        );

    }

    public static Performable go() {
        return Instrumented.instanceOf(LogoutTask.class).withProperties();
    }
}

