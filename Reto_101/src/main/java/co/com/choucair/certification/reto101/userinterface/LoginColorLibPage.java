package co.com.choucair.certification.reto101.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginColorLibPage extends PageObject {

    public static final Target user_name = Target.the("Ingresamos el nombre de usuario")
            .located(By.xpath("//*[@id='login']//input[@placeholder='Username']"));
    public static final Target password = Target.the("Ingresamos la contraseña")
            .located(By.xpath("//*[@id='login']//input[@placeholder='Password']"));
    public static final Target button_login = Target.the("Damos click en ingresa")
            .located(By.xpath("//*[@id='login']//button"));
}
