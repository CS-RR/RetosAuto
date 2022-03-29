package co.com.choucair.certification.reto201.questions;

import co.com.choucair.certification.reto201.model.BcDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.certification.reto201.userinterface.ResultadoCreditoPage.*;
public class Verifica implements Question<Boolean> {

    private final List<BcDatos> bcDatosList;

    public Verifica(List<BcDatos> bcDatosList) {
        this.bcDatosList = bcDatosList;
    }

    public static Verifica toThe(List<BcDatos> bcDatosList) {
        return new Verifica (bcDatosList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String Plazo = Text.of(plz_ans).viewedBy(actor).asString(); //Plazo definido para el credito.

        //---------Formula para determinar cuota mensual---------//
        String TI = tea_ans.resolveFor(actor).getTextValue().replace("%",""); //Tasa de Interes Anual devuelto por el sistema
        float TM = Float.parseFloat(TI);
        TM = ((TM/12)/100); //Tasa de Interes mensual

        String SV = sv_ans.resolveFor(actor).getTextValue().replace(".00", ""); //Seguro de Vida devuelto por el sistema
        StringBuilder num= new StringBuilder();
        for (int i=0; i<SV.length();i++)
        {
            if(Character.isDigit(SV.charAt(i)))
               num.append(SV.charAt(i));
        }
        int SeguroVida = Integer.parseInt(num.toString()); //Seguro de Vida

        String PLZ = plz_ans.resolveFor(actor).getTextValue(); //Plazo para el credito
        StringBuilder aux = new StringBuilder();
        for (int i=0; i<PLZ.length();i++)
        {
            if(Character.isDigit(PLZ.charAt(i)))
                aux.append(PLZ.charAt(i));
        }
        int plzo = Integer.parseInt(aux.toString()); //Plazo para el credito

        int prestamo = bcDatosList.get(0).getValor();
        System.out.println(prestamo);

        //-----FORMULA-----//
        float cte1 = (float) (TM*Math.pow((1+TM),plzo));
        float cte2 = (float) (Math.pow((1+TM),plzo)-1);
        float cte3 = (10000000*(cte1/cte2)+SeguroVida);
        System.out.println("$"+cte3);

        //Resultados esperados
        result = Plazo.equals(bcDatosList.get(0).getRplazo()); //Plazo para el credito
        return  result;
    }
}
