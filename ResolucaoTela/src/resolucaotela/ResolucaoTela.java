package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

        int altura = tela.width;
        int largura = tela.height;
        
        System.out.println("A resolução da sua tela é de: " + altura + "x" + largura);
    }
}