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
        //----------VALORES ENTREGADOS POR LA PLATAFORMA----------//
        String Plazo = Text.of(plz_ans).viewedBy(actor).asString(); //Plazo definido para el credito.
        String Cuota_Mensual = Text.of(cm_ans).viewedBy(actor).asString();//Cuota Mensual.
        String Seguro_Vida = Text.of(sv_ans).viewedBy(actor).asString(); //Seguro de Vida.
        String CuotaYSeguro = Text.of(cmsv_ans).viewedBy(actor).asString();//Valor Cuota mensual mas seguro.

        //----------VALORES PARA DETERMINAR VALOR CUOTA MENSUAL----------//
        String TEA = tea_ans.resolveFor(actor).getTextValue().replace("%",""); //Tasa Efectiva Anual(TEA) devuelto por el sistema
        float TEM = Float.parseFloat(TEA);
        TEM = ((TEM/12)/100); //Tasa de Interes mensual (TEM) obtenida

        String CuotaMes = Cuota_Mensual.replace("$","").replace(",","");//Cuota mensual devuelto por el sistema

        String SV = Seguro_Vida.replace(".00", ""); //Seguro de Vida devuelto por el sistema
        StringBuilder num= new StringBuilder();
        for (int i=0; i<SV.length();i++)
        {
            if(Character.isDigit(SV.charAt(i)))
               num.append(SV.charAt(i));
        }

        String cuota_mes_seguro = CuotaYSeguro.replace("$","").replace(",","");//Valor cuota mensual+seguro devuelto por el sistema

        String PLZ = Plazo; //Plazo para el credito devuelto por el sistema
        StringBuilder aux = new StringBuilder();
        for (int i=0; i<PLZ.length();i++)
        {
            if(Character.isDigit(PLZ.charAt(i)))
                aux.append(PLZ.charAt(i));
        }

        //----------Conversiones----------//
        int plazo = Integer.parseInt(aux.toString()); //Plazo para el credito devuelto por el sistema
        float valorcuotamensual = Float.valueOf(CuotaMes);//Cuota mensual devuelto por el sistema
        int seguroVida = Integer.parseInt(num.toString()); //Seguro de Vida devuelto por el sistema
        int prestamo = bcDatosList.get(0).getRvalor();//Valor del prestamo
        float cuotamasseguro = Float.valueOf(cuota_mes_seguro);//Valor cuota mensual mas seguro devuelto por el sistema
        System.out.println("Valor entregado cuota mas seguro $"+cuotamasseguro );

        //----------FORMULA----------//
        float cte1 = (float) (TEM*Math.pow((1+TEM),plazo));
        float cte2 = (float) (Math.pow((1+TEM),plazo)-1);
        float cuotacalculada = (prestamo*(cte1/cte2)+seguroVida);//Valor cuota calculada mas seguro
        System.out.println("Valor calculado cuota mas seguro $"+cuotacalculada);

        //----------RESULTADOS ESPERADOS----------//
        result = Plazo.equals(bcDatosList.get(0).getRplazo()); //Plazo para el credito
        if(cuotacalculada>cuotamasseguro)
            System.out.println("El valor calculado pasa el entregado por el sistema");
        else
            System.out.println("El valor calculado esta por debajo del entregado por el sistema");
        return  result;
    }
}