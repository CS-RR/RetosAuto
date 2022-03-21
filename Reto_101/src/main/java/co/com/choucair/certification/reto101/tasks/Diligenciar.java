package co.com.choucair.certification.reto101.tasks;

import co.com.choucair.certification.reto101.userinterface.ValidationColorLibPage;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Diligenciar implements Task {


    public static Diligenciar campos() {
        return Tasks.instrumented(Diligenciar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("LeroLero").into(ValidationColorLibPage.required_box),
                Enter.theValue("leroLero@ejemplo.com").into(ValidationColorLibPage.email_box),
                Enter.theValue("LeroLero123").into(ValidationColorLibPage.password_box),
                Enter.theValue("LeroLero123").into(ValidationColorLibPage.confirmpassword_box),
                Enter.theValue("02/10/1994").into(ValidationColorLibPage.date_box),
                Enter.theValue("https://lerolero360.com").into(ValidationColorLibPage.url_box),
                Enter.theValue("314159265").into(ValidationColorLibPage.digits_box),
                Enter.theValue("7").into(ValidationColorLibPage.range_box),
                Click.on(ValidationColorLibPage.policy_box),
                Click.on(ValidationColorLibPage.button_validate)
        );
    }
}
