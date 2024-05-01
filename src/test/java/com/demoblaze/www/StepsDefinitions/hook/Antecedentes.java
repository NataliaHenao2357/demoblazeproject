package com.demoblaze.www.StepsDefinitions.hook;

import com.demoblaze.www.Steps.BlazerStep;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.thucydides.core.util.EnvironmentVariables;

public class Antecedentes {

    BlazerStep blazerStep = new BlazerStep();

    private EnvironmentVariables environmentVariables;
    @Before
    public void configureBaseUrl() throws InterruptedException {
        String baseUrl = environmentVariables.optionalProperty("environments.qa.base.url").get();
        blazerStep.AbrirPagina(baseUrl);
    }

    @Dado("que estoy en la pagina web de demoblaze")
    public void queEstoyEnLaPaginaWebDeDemoblaze() {
    }
}
