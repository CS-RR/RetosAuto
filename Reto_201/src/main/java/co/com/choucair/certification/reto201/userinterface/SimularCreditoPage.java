package co.com.choucair.certification.reto201.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimularCreditoPage extends PageObject {

    public static final Target simular_box = Target.the("Lo que se desea simular cuota/monto")
            .located(By.xpath("//*[@id='sim-detail']/form/div[2]/select/option[2]"));

    public static final Target fecha_año = Target.the("Ingreso año")
            .located(By.xpath("//*[@name='dateFechaNacimiento']"));

    public static final Target tasa_box = Target.the("Tipo de tasa fija/variable")
            .located(By.xpath("//*[@id='sim-detail']/form/div[4]/select/option[2]"));

    public static final Target producto_box = Target.the("Tipo de credito libranza/pignoracion")
            .located(By.xpath("//*[@id='sim-detail']/form/div[5]/div[1]/select/option[3]"));

    public static final Target plazo_box = Target.the("Plazo del prestamo")
            .located(By.xpath("//*[@id='sim-detail']/form/div[7]/div[1]/input"));

    public static final Target valor_box = Target.the("El monto que se desea solicitar")
            .located(By.xpath("//*[@id='sim-detail']/form/div[7]/div[2]/input"));

    public static final Target button_simular = Target.the("Boton simular")
            .located(By.xpath("//*[@id=\"sim-detail\"]/form/div[8]/button"));
}
