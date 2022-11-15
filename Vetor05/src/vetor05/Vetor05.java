package vetor05;

import java.util.Arrays;

/**
 * @author diarley
 */
public class Vetor05 {

    public static void main(String[] args) {
        
        int vetor[] = new int[50];
        
        Arrays.fill(vetor, 0);
        
        for (int valor: vetor){
            System.out.print(valor + " ");
        }        
    }    
}