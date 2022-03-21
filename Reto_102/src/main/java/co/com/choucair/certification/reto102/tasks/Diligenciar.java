package co.com.choucair.certification.reto102.tasks;

import co.com.choucair.certification.reto102.userinterface.InlineColorLibPage;
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
                Enter.theValue("LeroLero").into(InlineColorLibPage.required_box),
                Enter.theValue("leroLero@ejemplo.com").into(InlineColorLibPage.email_box),
                Enter.theValue("LeroLero123").into(InlineColorLibPage.password_box),
                Enter.theValue("LeroLero123").into(InlineColorLibPage.confirmpassword_box),
                Enter.theValue("02/10/1994").into(InlineColorLibPage.date_box),
                Enter.theValue("https://lerolero360.com").into(InlineColorLibPage.url_box),
                Click.on(InlineColorLibPage.policy_box),
                Enter.theValue("asd").into(InlineColorLibPage.minchar_box),
                Enter.theValue("asdqwe").into(InlineColorLibPage.maxchar_box),
                Enter.theValue("3").into(InlineColorLibPage.minnum_box),
                Enter.theValue("13").into(InlineColorLibPage.maxnum_box),
                Click.on(InlineColorLibPage.button_validate)
        );
    }
}
