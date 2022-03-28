package co.com.choucair.certification.reto201.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadoCreditoPage extends PageObject {

    public static final Target tea_ans = Target.the("Tasa efectiva anual utilizada en la simulación")
            .located(By.xpath("//*[@id='sim-results']//td[2][text()='14.3%']"));
    public static final Target tmv_ans = Target.the("Tasa mes vencida utilizada en la simulación")
            .located(By.xpath("//*[@id='sim-results']//td[2][text()='1.12%']"));
    public static final Target cm_ans = Target.the("Cuota mensual")
            .located(By.xpath("//*[@id='sim-results']//td[3][text()='$477,487.56']"));
    public static final Target sv_ans = Target.the("Seguro de vida asociado a la deuda por cuota")
            .located(By.xpath("//*[@id='sim-results']//td[2][text()='$12,000.00']"));
    public static final Target cmsv_ans = Target.the("Cuota mensual mas seguros")
            .located(By.xpath("//*[@id='sim-results']//td[2][text()='$489,487.56']"));
    public static final Target plz_ans = Target.the("Plazo elegido para el credito")
            .located(By.xpath("//*[@id='sim-results']//td[2][text()='24 meses']"));

}
