package co.com.choucair.certification.reto201.stepdefinitions;

import co.com.choucair.certification.reto201.model.BcDatos;
import co.com.choucair.certification.reto201.tasks.Llenar;
import co.com.choucair.certification.reto201.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SimulacionCuotaStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^Laura ingresa a la pagina de bancolombia en la seccion simulacion de credito$")
    public void lauraIngresaALaPaginaDeBancolombiaEnLaSeccionSimulacionDeCredito(){
        OnStage.theActorCalled("Laura").wasAbleTo(OpenUp.thepage());
    }

    @When("^Ingresa los datos necesarios para simular su credito$")
    public void ingresaLosDatosNecesariosParaSimularSuCredito(List<BcDatos> bcDatosList){
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.formulario(bcDatosList));
    }

    @Then("^verfica los resultados obtenidos para su cuota mensual$")
    public void verficaLosResultadosObtenidosParaSuCuotaMensual() {
    }

}
