package co.com.choucair.certification.reto102.tasks;

import co.com.choucair.certification.reto102.model.ColorLibData;
import co.com.choucair.certification.reto102.userinterface.LoginColorLibPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {

    private final List<ColorLibData> colorLibData;

    public Login(List<ColorLibData> colorLibData) {
        this.colorLibData = colorLibData;
    }

    public static Login OnthePage(List<ColorLibData> colorLibData) {
        return Tasks.instrumented(Login.class, colorLibData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(String.valueOf(colorLibData.get(0).getUser())).into(LoginColorLibPage.user_name),
                Enter.theValue(String.valueOf(colorLibData.get(0).getPassword())).into(LoginColorLibPage.password),
                Click.on(LoginColorLibPage.button_login)
        );
    }
}
