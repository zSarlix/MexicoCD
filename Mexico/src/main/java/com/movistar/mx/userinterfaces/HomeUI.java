package com.movistar.mx.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class HomeUI {



    public static final Target BTN_POPUP = Target.the("BTN POPUP").locatedBy("//*[@resource-id='PopupPromotionsPageBtnClose']");

    public static final Target BTN_POPUP_LOGIN = Target.the("Text Name bar").locatedBy("//*[@text='En otro momento']");

    public static final Target BTN_MENU = Target.the("BTN LOGGIN MENU").locatedBy("//*[@text='menu']");

    public static final Target BTN_SALIR = Target.the("EXIT BOTTON").locatedBy("//*[@text='Salir']");

    public static final Target BTN_ACEPTAR = Target.the("button seleccion").locatedBy("//*[@text='ACEPTO']");

    public static final Target BTN_RECHARGE = Target.the("button seleccion").locatedBy("//*[@text='Compra']");

}


