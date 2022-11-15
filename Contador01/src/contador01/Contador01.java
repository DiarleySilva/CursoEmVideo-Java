package contador01;

/**
 * @author diarley
 */
public class Contador01 {
    
    public static void main(String[] args) {
        
        int conCambalhota = 0;
        
        while (conCambalhota <= 10){
            conCambalhota++;
            if (conCambalhota == 2 || conCambalhota == 3 || conCambalhota == 4){
                continue;
            }
            if (conCambalhota == 7){
                break;
            }
            System.out.println("Cambalhota " + conCambalhota);
        /*while (conCambalhota <= 10){
            conCambalhota++;
            if (conCambalhota == 5 || conCambalhota == 7 || conCambalhota == 9){
                continue;
            }
            System.out.println("Cambalhota " + conCambalhota);
            //conCambalhota++;*/
        }
        
        /*int conCambalhota = 1;
        
        while (conCambalhota <= 10){
            System.out.println("Cambalhota " + conCambalhota);
            conCambalhota++;*/
    }
}