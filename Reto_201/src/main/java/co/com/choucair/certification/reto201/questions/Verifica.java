package co.com.choucair.certification.reto201.questions;

import co.com.choucair.certification.reto201.model.BcDatos;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

import java.util.List;

import static co.com.choucair.certification.reto201.userinterface.ResultadoCreditoPage.*;
public class Verifica implements Question<Boolean> {

    private List<BcDatos> bcDatosList;

    public Verifica(List<BcDatos> bcDatosList) {
        this.bcDatosList = bcDatosList;
    }

    public static Verifica toThe(List<BcDatos> bcDatosList) {
        return new Verifica (bcDatosList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        //Resultados Obtenidos
        /*
        String TasaEfectivaAnual = Text.of(tea_ans).viewedBy(actor).asString(); //Tasa Efectiva Anual.
        String TasaMesVencida = Text.of(tmv_ans).viewedBy(actor).asString(); //Tasa Mes Vencido.
        String CuotaMensual = Text.of(cm_ans).viewedBy(actor).asString(); //Cuota Mensual.
        String SeguroVida = Text.of(sv_ans).viewedBy(actor).asString(); //Seguro de Vida.
        String Cuota_Seguro = Text.of(cmsv_ans).viewedBy(actor).asString(); //Cuota mensual mas seguro de vida.
        */
        String Plazo = Text.of(plz_ans).viewedBy(actor).asString(); //Plazo definido para el credito.

        //---------Formula para determinar cuota mensual---------//
        String TI = tea_ans.resolveFor(actor).getTextValue(); //Tasa de Interes Anual devuelto por el sistema
        TI= TI.replace("%","");
        float TM = Float.valueOf(TI);
        TM = ((TM/12)/100); //Tasa de Interesa mensual

        String SV = sv_ans.resolveFor(actor).getTextValue(); //Seguro de Vida devuelto por el sistema
        SV = SV.replace(".00", "");
        String num= "";
        for (int i=0; i<SV.length();i++)
        {
            if(Character.isDigit(SV.charAt(i)))
               num+= SV.charAt(i);
        }
        int SeguroVida = Integer.parseInt(num); //Seguro de Vida



        //-----FORMULA-----//
        float cte1 = (float) (TM*Math.pow((1+TM),24));
        float cte2 = (float) (Math.pow((1+TM),24)-1);
        float cte3 = (10000000*(cte1/cte2)+SeguroVida);
        System.out.println(cte3);

        //Resultados esperados
        result = Plazo.equals(bcDatosList.get(0).getRplazo()); //Plazo para el credito
        return  result;
    }
}
