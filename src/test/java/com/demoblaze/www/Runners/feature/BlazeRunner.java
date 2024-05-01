package com.demoblaze.www.Runners.feature;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/PruebasE2EDemoblaze.feature",
        glue = "com.demoblaze.www.StepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@CA03"
)

public class BlazeRunner {
}
