package testefuncao01;

/**
 * @author diarley
 */
public class TesteFuncao01 {

    /*static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }*/
    
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
            System.out.println("Programa iniciado!");
            int somar = soma(5, 2);
            System.out.println("A soma é " + somar);
    }
}