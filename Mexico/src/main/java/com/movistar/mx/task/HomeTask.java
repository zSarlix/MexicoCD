package com.movistar.mx.task;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.movistar.mx.userinterfaces.HomeUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HomeTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    WaitUntil.the(BTN_POPUP, isVisible()).forNoMoreThan(150).seconds(),
                    Click.on(BTN_POPUP)
              //      WaitUntil.the(BTN_POPUP_LOGIN, isVisible()).forNoMoreThan(30).seconds(),
              //     Click.on(BTN_POPUP_LOGIN)


                   );


    }

    public static Performable go() {
        return Instrumented.instanceOf(HomeTask.class).withProperties();
    }
}

