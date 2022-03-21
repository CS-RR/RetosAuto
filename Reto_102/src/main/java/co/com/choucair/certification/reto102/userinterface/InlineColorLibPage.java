package co.com.choucair.certification.reto102.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InlineColorLibPage {

    public static final Target required_box = Target.the("Campo Required")
            .located(By.xpath("//*[@id='required']"));
    public static final Target email_box = Target.the("Campo Email")
            .located(By.xpath("//*[@id='email']"));
    public static final Target password_box = Target.the("Campo Password")
            .located(By.xpath("//*[@id='password']"));
    public static final Target confirmpassword_box = Target.the("Campo Confirmación Password")
            .located(By.xpath("//*[@id='confirm_password']"));
    public static final Target date_box = Target.the("Campo Fecha")
            .located(By.xpath("//*[@id='date']"));
    public static final Target url_box = Target.the("Campo Url")
            .located(By.xpath("//*[@id='url']"));
    public static final Target policy_box = Target.the("Campo aceptar politica")
            .located(By.xpath("//*[@id='agree']"));
    public static final Target minchar_box = Target.the("Campo minimo 3 caracteres")
            .located(By.xpath("//*[@id='minsize']"));
    public static final Target maxchar_box = Target.the("Campo maximo 6 caracteres")
            .located(By.xpath("//*[@id='maxsize']"));
    public static final Target minnum_box = Target.the("Campo minimo 3 digitos")
            .located(By.xpath("//*[@id='minNum']"));
    public static final Target maxnum_box = Target.the("Campo maximo 16 digitos")
            .located(By.xpath("//*[@id='maxNum']"));
    public static final Target button_validate = Target.the("Boton Validar")
            .located(By.xpath("//*[@id='inline-validate']/div[12]/input"));
}
