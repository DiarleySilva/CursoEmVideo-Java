package funcao01;

/**
 * @author diarley
 */
public class Fatorial {

    private int num = 0;
    private int fat = 1;
    private String formula = "";

    public void setValor(int n) {
        
        num = n;
        
        int f = 1;
        String frase = "";
        
        for (int contador = n; contador > 1; contador--) {
            f *= contador;
            frase += contador + " x ";
        }
        frase += "1 = ";
        fat = f;
        formula = frase;
    }

    public int getFatorial() {
        return fat;
    }

    public String getFormula() {
        return formula;
    }
}