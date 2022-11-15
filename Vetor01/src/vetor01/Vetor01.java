package vetor01;

/**
 * @author diarley
 */
public class Vetor01 {

    public static void main(String[] args) {
        //int n[] = new int [4];
        int numero[] = {1,2,3,4};
        
        System.out.println("O vetor 'numero' tem " + numero.length + " casas.");

        /*for(int contador = 0; contador <= 3; contador++){
            System.out.println("Na posição " + contador + " tem o valor " + numero[contador]);
        }*/
        for(int contador = 0; contador <= numero.length - 1; contador++){
            System.out.println("Na posição " + contador + " tem o valor " + numero[contador]);
        }
    }    
}