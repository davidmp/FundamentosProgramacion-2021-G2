package pe.edu.upeu;
import pe.edu.upeu.modulo.*;
/**
 * Hello world!
 *
 */
public class App {

    static SubProgramas sp=new SubProgramas();
    static Recursividad re=new Recursividad();

    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        sp.saludo();
        int valor=re.factorial(10);
        System.out.println(valor);
    }
    
}
