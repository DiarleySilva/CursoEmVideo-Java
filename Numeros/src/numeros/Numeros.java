package numeros;

import java.util.Scanner;

/**
 * @author diarley
 */
public class Numeros {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero, soma = 0;
        String resposta;

        do {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero;
            System.out.print("Quer continuar? [S/N]: ");
            resposta = teclado.next();
        } while (resposta.equals("S"));
        System.out.println("A soma de todos os valores é de: " + soma);
    }
}
