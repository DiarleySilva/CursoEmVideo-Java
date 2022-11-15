package programapernas;

import java.util.Scanner;

/**
 * @author diarley
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pernas tem: ");
        int pernas = teclado.nextInt();

        String tipo;

        System.out.print("Isso é um(a) ");
        
        /*tipo = switch (pernas) {
            case 1 -> "Saci";
            case 2 -> "Bípede";
            case 3 -> "Tripé";
            case 4 -> "Quadrúpede";
            case 6 -> "Aranha";
            default -> "ET";*/

        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}