package co.com.choucair.certification.reto102.stepdefinitions;

import co.com.choucair.certification.reto102.model.ColorLibData;
import co.com.choucair.certification.reto102.tasks.Diligenciar;
import co.com.choucair.certification.reto102.tasks.Login;
import co.com.choucair.certification.reto102.tasks.MenuForms;
import co.com.choucair.certification.reto102.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ColorLibStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^pedro ingresa a la pagina colorlib y se autentica$")
    public void pedroIngresaALaPaginaColorlibYSeAutentica(List<ColorLibData> colorLibData) {
        OnStage.theActorCalled("Pedro").wasAbleTo(OpenUp.thepage(), Login.OnthePage(colorLibData));
    }

    @When("^Ingresa a la pagina y busca la seccion Inline validation$")
    public void ingresaALaPaginaYBuscaLaSeccionInlineValidation() {
        OnStage.theActorInTheSpotlight().attemptsTo(MenuForms.submenu());
    }

    @When("^diligencia el formulario Inline validation$")
    public void diligenciaElFormularioInlineValidation()  {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.campos());
    }

    @Then("^verifica respuesta correcta/fallida del diligenciamiento$")
    public void verificaRespuestaCorrectaFallidaDelDiligenciamiento() {
    }
}
