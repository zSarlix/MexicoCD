package com.movistar.mx.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {


    public static final Target TXT_MAIL = Target.the("Click Bar Button").locatedBy("//*[@resource-id='idNumberSpan']");

    public static final Target TXT_MAIL_DATA = Target.the("Click Bar Button").locatedBy("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText");

    public static final Target TXT_PASSWORD = Target.the("send text button password").locatedBy("//*[@resource-id='password']");

    public static final Target BTN_LOGIN = Target.the("button seleccion").locatedBy("//*[@text='Ingresar']");

    public static final Target BTN_ACEPTAR = Target.the("button seleccion").locatedBy("//*[@text='ACEPTO']");

    public static final Target BTN_HIDE = Target.the("button seleccion").locatedBy("//*[@resource-id='idPswImg']");


}
