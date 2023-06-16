package com.movistar.mx.task;


import com.movistar.mx.interactions.Scroll;
import com.movistar.mx.userinterfaces.LoginUI;
import com.movistar.mx.utils.DataExcel;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.movistar.mx.driver.AppiumAndroidDriver.driver;
import static com.movistar.mx.userinterfaces.HomeUI.BTN_RECHARGE;
import static com.movistar.mx.userinterfaces.LoginUI.*;
import static com.movistar.mx.userinterfaces.ReloadPackageUI.BTN_DATOS;
import static com.movistar.mx.userinterfaces.ReloadPackageUI.BTN_RECARGA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ReloadPackageTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        ArrayList<Map<String, String>> dataExcel;


        actor.attemptsTo(
                WaitUntil.the(BTN_RECHARGE, isVisible()).forNoMoreThan(150).seconds(),
                Click.on(BTN_RECHARGE),
                WaitUntil.the(BTN_DATOS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_DATOS),
                Scroll.go()
        );



        actor.attemptsTo(
                WaitUntil.the(BTN_RECARGA, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_RECARGA)

        );


    }

    public static Performable go() {
        return Instrumented.instanceOf(ReloadPackageTask.class).withProperties();
    }
}

