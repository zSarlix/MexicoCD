package com.movistar.mx.stepsdefinitions;


import com.movistar.mx.driver.AppiumAndroidDriver;
import com.movistar.mx.task.HomeTask;
import com.movistar.mx.task.LoginTask;
import com.movistar.mx.task.LogoutTask;
import com.movistar.mx.task.ReloadPackageTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class ReloadPackage {


    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^Reload mi package$")
    public void reloadMiPackage() {
        OnStage.theActorInTheSpotlight().attemptsTo(ReloadPackageTask.go());
    }



}
