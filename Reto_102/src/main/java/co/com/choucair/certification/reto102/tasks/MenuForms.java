package co.com.choucair.certification.reto102.tasks;


import co.com.choucair.certification.reto102.userinterface.MenusColorLibPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class MenuForms implements Task {


    public static MenuForms submenu() {
        return Tasks.instrumented(MenuForms.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenusColorLibPage.menu_forms),
                Click.on(MenusColorLibPage.menu_validation)
        );
    }
}
