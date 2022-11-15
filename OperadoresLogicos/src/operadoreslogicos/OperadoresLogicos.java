package operadoreslogicos;

/**
 * @author diarley
 */
public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        int x = 4, y = 7, z = 12;
        boolean resultado;
        
        // && significa "e"
        /*resultado = (x<y && y<z) ? true : false;
        System.out.println(resultado);*/
        
        /*resultado = (x<y && y==z) ? true : false;
        System.out.println(resultado);*/
       
        // || significa "ou"
        /*resultado = (x<y || y==z) ? true : false;
        System.out.println(resultado);*/
        
        //  ^ significa "ou exclusivo"
        /*esultado = (x<y  ^ y==z) ? true : false;
        System.out.println(resultado);*/
        
        resultado = (x<y  ^ y<z) ? true : false;
        System.out.println(resultado);
    }  
}