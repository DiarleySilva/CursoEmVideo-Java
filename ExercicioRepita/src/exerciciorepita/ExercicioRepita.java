package exerciciorepita;

import javax.swing.JOptionPane;

/**
 * @author diarley
 */
public class ExercicioRepita {

    public static void main(String[] args) {
        
        int numero = 0, soma = 0, conta = -1, par = 0, impar = 0, maisCem = 0, media = 0;
        
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: (valor 0 interrompe)"));

            soma += numero;
            conta++;

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            if (numero >= 100) {
                maisCem++;
            }

        } while (numero != 0);

        media = soma / conta;

        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr>Total de valores: " + conta + "<br>Total de pares: " + par + "<br>Total de ímpares: " + impar + "<br>Acima de 100: " + maisCem + "<br>Soma dos valores: " + soma + "<br>Média dos valores: " + media);
    }
}
