package programaidade;

import java.util.Scanner;

/**
 * @author diarley
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Em que ano você nasceu: ");
        int nasc = teclado.nextInt();
        
        int ano = 2022 - nasc;
        
        System.out.println("Você tem " + ano + "anos.");
        
        if(ano >= 18){
            System.out.println("Maior de idade.");
        }
        else{
            System.out.println("Menor de idade.");
        }
    }
}