package com.movistar.mx.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "com.movistar.mx.stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@InisioSesion"
)

public class LoginRunner {
}
