package vetor03;

import java.util.Arrays;

/**
 * @author diarley
 */
public class Vetor03 {

    public static void main(String[] args) {
        
        float vetor[] = {5, 67, 2, 38, 8, 2};
        
        Arrays.sort(vetor);

        for (float valor : vetor) {
            System.out.println(valor);
        }
    }
}