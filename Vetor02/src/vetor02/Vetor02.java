package vetor02;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author diarley
 */
public class Vetor02 {

    public static void main(String[] args) {
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Calendar calendario = GregorianCalendar.getInstance();
        int ano = calendario.get(Calendar.YEAR);

        for (int contador = 0; contador < mes.length; contador++) {

            if ((ano % 4 == 0) && (ano % 10 != 0) || (ano % 400 == 0)){
                dia[1] = 29;
                System.out.println("O mês de " + mes[contador] + " tem " + dia[contador] + " dias");
            }
            else{
                 System.out.println("O mês de " + mes[contador] + " tem " + dia[contador] + " dias");
            }
        }
    }
}
