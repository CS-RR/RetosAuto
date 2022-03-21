package co.com.choucair.certification.reto101.stepdefinitions;

import co.com.choucair.certification.reto101.model.ColorLibData;
import co.com.choucair.certification.reto101.tasks.Diligenciar;
import co.com.choucair.certification.reto101.tasks.Login;
import co.com.choucair.certification.reto101.tasks.MenuForms;
import co.com.choucair.certification.reto101.tasks.OpenUp;
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
    public void pedroIngresaALaPaginaColorlibYSeAutentica(List<ColorLibData> colorLibDataList){
        OnStage.theActorCalled("Pedro").wasAbleTo(OpenUp.thepage(),(Login.OnThePage(colorLibDataList)));
    }

    @When("^Ingresa a la pagina y busca la seccion block validation$")
    public void ingresaALaPaginaYBuscaLaSeccionBlockValidation()  {
       OnStage.theActorInTheSpotlight().attemptsTo(MenuForms.submenu());
    }

    @When("^diligencia el formulario block validation$")
    public void diligenciaElFormularioBlockValidation()  {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.campos());
    }

    @Then("^verifica respuesta correcta/fallida del diligenciamiento$")
    public void verificaRespuestaCorrectaFallidaDelDiligenciamiento(){
    }
}
