package vetor04;

import java.util.Arrays;

/**
 * @author diarley
 */
public class Vetor04 {

    public static void main(String[] args) {
        
        int vetor[] = {1, 2, 6, 4, 7, 9, 3};
        
        for(int valor: vetor){
            System.out.print(valor + " ");
        }
        
        System.out.println("");
        
        int posicao = Arrays.binarySearch(vetor, 4);
        
        System.out.println("Encontrei o valor na posição " + posicao);
    }
}