package co.com.choucair.certification.reto201.tasks;

import co.com.choucair.certification.reto201.model.BcDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class Llenar implements Task {

    private final List<BcDatos> bcDatosList;

    public Llenar(List<BcDatos> bcDatosList) {
        this.bcDatosList = bcDatosList;
    }

    public static Llenar formulario(List<BcDatos> bcDatosList) {
        return Tasks.instrumented(Llenar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
