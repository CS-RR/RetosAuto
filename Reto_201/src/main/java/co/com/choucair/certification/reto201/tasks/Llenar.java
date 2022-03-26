package co.com.choucair.certification.reto201.tasks;

import co.com.choucair.certification.reto201.model.BcDatos;
import co.com.choucair.certification.reto201.userinterface.SimularCreditoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Llenar implements Task {

    private final List<BcDatos> bcDatosList;

    public Llenar(List<BcDatos> bcDatosList) {
        this.bcDatosList = bcDatosList;
    }

    public static Llenar formulario(List<BcDatos> bcDatosList) {
        return Tasks.instrumented(Llenar.class, bcDatosList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SimularCreditoPage.simular_box),
                Enter.theValue(String.valueOf(bcDatosList.get(0).getFecha())).into(SimularCreditoPage.fecha_año),
                Click.on(SimularCreditoPage.tasa_box),
                Click.on(SimularCreditoPage.producto_box),
                Enter.theValue(String.valueOf(bcDatosList.get(0).getPlazo())).into(SimularCreditoPage.plazo_box),
                Enter.theValue(String.valueOf(bcDatosList.get(0).getValor())).into(SimularCreditoPage.valor_box),
                Click.on(SimularCreditoPage.button_simular)
        );
    }
}
