import java.util.Scanner;

public class BonoPorDesempeno {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bono, puntos, salario_minimo;
        System.out.print("Ingresa el valor de puntos: ");
        puntos = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de salario minimo: ");
        salario_minimo = in.nextDouble();
        in.nextLine();
        bono=0;
        if(puntos>=100 && puntos<=200)
            bono=salario_minimo*0.10;
        if(puntos>=201 && puntos<=300)
            bono=salario_minimo*0.40;
        if(puntos>=301 && puntos<=400)
            bono=salario_minimo*0.70;
        if(puntos>401)
            bono=salario_minimo*0.80;
        System.out.println("Valor de bono: " + bono);
    }

}