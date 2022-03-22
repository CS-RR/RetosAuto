package co.com.choucair.certification.reto201.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Nombre del .feature",
        tags = "@tag1",
        glue = "co.com.choucair.certification.proyectobase.stepdefinitions ",//Carpeta donde irá el Stepdefinitions
        snippets = SnippetType.CAMELCASE )
public class SimulacionRunner {
}
