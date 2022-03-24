package co.com.choucair.certification.reto201.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.bancolombia.com/personas/creditos")
public class BcSimularPage extends PageObject {

    public static final Target link_simular = Target.the("Link para ir a la pagina de simular credito")
            .located(By.xpath("\n" +
                    "//*[@id='creditos']/div/div[1]/div[1]/div/div[2]/div/a[contains(text(),'Simular')]"));
}
