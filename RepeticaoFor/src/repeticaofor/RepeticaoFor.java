package repeticaofor;

/**
 * @author diarley
 */
public class RepeticaoFor {

    public static void main(String[] args) {
        /*
        for (int conCambalhota = 0; conCambalhota <= 3; conCambalhota++) {
            System.out.println("Cambalhota " + conCambalhota);
        }
        */
        
        /*
            int conCambalhota = 0;
            while(conCambalhota <4){
                System.out.println("Cambalhota");
                conCambalhota++;
            }
         */
        
        /*
        for(int contador = 1; contador <= 100; contador++){
            System.out.println(contador);
        }
        */
        
        for(int i = 1; i <= 3; i++){
            for(int j = 0; j <= 2; j += 2){
                System.out.println("I = " + i + "  ---------  J = " + j);
            }
        }                        
    }
}
