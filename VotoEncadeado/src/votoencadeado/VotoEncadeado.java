package votoencadeado;

import java.util.Scanner;

/**
 * @author diarley
 */
public class VotoEncadeado {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu ano de nasicimento: ");
        int nasc = teclado.nextInt();
        
        int ano = 2022 - nasc;
        
        System.out.println("Você tem " + ano + " anos.");
        
        if(ano < 16){
            System.out.println("Não vota.");
        }
        else{
            if((ano >= 16 && ano < 18) || (ano > 70)){
                System.out.println("Voto opcional.");
            }
            else{
                System.out.println("Voto obrigátorio.");
            }
        }
    }
}