package comparacaostring;

/**
 * @author diarley
 */
public class ComparacaoString {

    public static void main(String[] args) {
        /*String nome1 = "Diarley";
        String nome2 = "Diarley";
        String nome3 = new String("Diarley");
        String res;
        res = (nome1 == nome3) ? "igual" : "diferente";
        System.out.println(res);*/
        
        // O método "equals" verifica se o conteúdo é igual
        String nome1 = "Diarley";
        String nome2 = "Diarley";
        String nome3 = new String("Diarley");
        String res;
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
    }
}