package operadoresaritmeticos;

/**
 * @author diarley
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2) / 2;
        System.out.println("A média é de:" + media);*/
        
        // INCREMENTO ++
        /*int numero = 5;
        numero++;
        System.out.println(numero);*/
        
        // DECREMENTO --
        /*int numero = 5;
        numero--;
        System.out.println(numero);*/
        
        /*int numero = 5;
        int valor = 5 + numero--;
        System.out.println(valor);
        System.out.println(numero);*/
        
        /*int x = 4;
        x *= 2; // x = x + 2 ou x = x - 2 ou x = x * 2
        System.out.println(x);*/
        
        /*float y = 8.9f;
        int valor = (int) Math.abs(y);
        System.out.println("Valor absoluto: " + valor);
        int valor2 = (int) Math.floor(y);
        System.out.println("Arrendondamento para baixo: " + valor2);
        int valor3 = (int) Math.ceil(y);
        System.out.println("Arrendondamento para cima: " + valor3);
        int valor4 = (int) Math.round(y);
        System.out.println("Arrendondamento: " + valor4);*/
        
        /*double aleat = Math.random();
        System.out.println(aleat);*/
        
        double aleat = Math.random();
        int valor = (int) (1 + aleat * (1000 - 1));
        System.out.println(valor);
        
        /*
        int n1 = 3;
        int n2 = 5;
        float media = n1 + n2 / 2;
        System.out.println("A média é de:" + media);
        */
    }    
}