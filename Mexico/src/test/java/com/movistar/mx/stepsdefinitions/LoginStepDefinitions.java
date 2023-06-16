package com.movistar.mx.stepsdefinitions;


import com.movistar.mx.driver.AppiumAndroidDriver;
import com.movistar.mx.task.HomeTask;
import com.movistar.mx.task.LoginTask;
import com.movistar.mx.task.LogoutTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class LoginStepDefinitions {


    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());

    }


    @Given("^Need Login in app$")
    public void NeedLogininapp() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.suNavegador().onDriver()));

    }

    @When("^i look the home$")
    public void ilookthehome() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.go(), HomeTask.go());
    }

    @Then("^Loggount and verification exit$")
    public void Loggountandverificationexit() {
        OnStage.theActorInTheSpotlight().attemptsTo(LogoutTask.go());

    }

}
