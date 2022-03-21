package co.com.choucair.certification.reto101.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/InteracionPaginaColorlib.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.reto101.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class BlockValidationRunner {
}
