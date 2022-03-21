package co.com.choucair.certification.reto101.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidationColorLibPage extends PageObject {

 public static final Target required_box = Target.the("Campo Required")
         .located(By.xpath("//*[@id='required2']"));
 public static final Target email_box = Target.the("Campo Email")
         .located(By.xpath("//*[@id='email2']"));
 public static final Target password_box = Target.the("Campo Password")
         .located(By.xpath("//*[@id='password2']"));
 public static final Target confirmpassword_box = Target.the("Campo Confirmación Password")
         .located(By.xpath("//*[@id='confirm_password2']"));
 public static final Target date_box = Target.the("Campo Fecha")
         .located(By.xpath("//*[@id='date2']"));
 public static final Target url_box = Target.the("Campo Url")
         .located(By.xpath("//*[@id='url2']"));
 public static final Target digits_box = Target.the("Campo Solo Digitos")
         .located(By.xpath("//*[@id='digits']"));
 public static final Target range_box = Target.the("Campo Rango [6-16]")
         .located(By.xpath("//*[@id='range']"));
 public static final Target policy_box = Target.the("Campo aceptar politica")
         .located(By.xpath("//*[@id='agree2']"));
 public static final Target button_validate = Target.the("Boton Validar")
         .located(By.xpath("//*[@id='block-validate']/div[10]/input"));
}
