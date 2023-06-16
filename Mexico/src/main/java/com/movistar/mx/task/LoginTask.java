package com.movistar.mx.task;


import com.movistar.mx.interactions.WaitFor;
import com.movistar.mx.utils.DataExcel;

import com.movistar.mx.userinterfaces.LoginUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.movistar.mx.driver.AppiumAndroidDriver.driver;
import static com.movistar.mx.userinterfaces.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        ArrayList<Map<String, String>> dataExcel;

        try {
            dataExcel = DataExcel.leerDatosDeHojaDeExcel("ExcelDatos.xlsx", "data");


            actor.attemptsTo(
                    WaitUntil.the(BTN_ACEPTAR, isVisible()).forNoMoreThan(150).seconds(),
                    Click.on(BTN_ACEPTAR),
                    Click.on(TXT_MAIL),
                    WaitUntil.the(TXT_MAIL_DATA, isVisible()).forNoMoreThan(150).seconds(),
                    Enter.keyValues(dataExcel.get(0).get("Correo")).into(LoginUI.TXT_MAIL_DATA),
                    Click.on(LoginUI.TXT_PASSWORD),
                    WaitUntil.the(TXT_PASSWORD, isVisible()).forNoMoreThan(150).seconds(),
                    Enter.keyValues(dataExcel.get(0).get("Password")).into(LoginUI.TXT_PASSWORD)

            );


            actor.attemptsTo(
                    WaitUntil.the(LoginUI.BTN_HIDE, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(BTN_HIDE),
                    WaitUntil.the(LoginUI.BTN_LOGIN, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(LoginUI.BTN_LOGIN)


                    );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Performable go() {
        return Instrumented.instanceOf(LoginTask.class).withProperties();
    }
}

