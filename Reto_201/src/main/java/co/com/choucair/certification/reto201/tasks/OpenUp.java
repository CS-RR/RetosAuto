package co.com.choucair.certification.reto201.tasks;

import co.com.choucair.certification.reto201.userinterface.BcSimularPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private  BcSimularPage bcSimularPage;

    public static OpenUp thepage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(bcSimularPage),
                Click.on(BcSimularPage.link_simular)
        );
    }
}
