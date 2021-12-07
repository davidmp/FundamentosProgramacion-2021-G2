package pe.edu.upeu.app;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import org.fusesource.jansi.Ansi.Color;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnsiConsole.systemInstall();
        Ansi color=new Ansi();
        System.out.println(color.bgYellow().fg(Color.RED).a("Holassss"));
        color=new Ansi();
        //System.out.println(color.fg(Color.BLUE).a("Holassss"));
        System.out.println(color.render("@|blue Holasss |@ @|green VErsdsd |@  "));
        MenuPrincipal mp=new MenuPrincipal();
        mp.mainLogin();
        
    }
}
