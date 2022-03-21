package co.com.choucair.certification.reto102.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenusColorLibPage extends PageObject {

    public static final Target menu_forms = Target.the("Damos clic en el menú forms")
            .located(By.xpath("//*[@id='menu']//span[contains(text(),'Forms')]"));

    public static final Target menu_validation = Target.the("Damos clic en el submenú Form Validation")
            .located(By.xpath("//*[@id='menu']//a[@href='form-validation.html']"));
}
