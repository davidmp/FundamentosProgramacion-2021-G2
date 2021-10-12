import java.util.Scanner;
import java.util.Random;
public class EstCiclicas{  
    static Scanner sc=new Scanner(System.in);
    //para leer    valores del teclado
    static final Random generator = new Random();
    
    public static int random(int min, int max) {
        return min + (generator.nextInt() * (max - min));
    }
    static void contarNumMenorCeroMayorCeroWhile(){
      //Declarar Variables
      int numMenEqCero=0, numMayCero=0, numeroN, cantNum;
      //Datos de entrada
      System.out.println("Ingrese la cantidad de numeros a evaluar:");
      cantNum=sc.nextInt();
      //Proceso
        while (cantNum>=1) {
          numeroN=random(-9, 9);
          System.out.println(numeroN);
          if(numeroN<=0){
            numMenEqCero++;
          }else{
            numMayCero++;
          }
          cantNum--;
          // code block to be executed
        }
      //Datos de salida
      System.out.println("Cantidad de numeros menores o iguales a cero son:"+numMenEqCero+"\nLa cantidad de numeros mayores a cero son:"+numMayCero);
    }

  static void factorial(){
    //Definir Variables
    int n, resulF=1;
    //datos de entrada
    System.out.println("Ingrese un numero para calcular el Factorial:");
    n=sc.nextInt();
    //Proceso
    if(n>1){
      for(int i=1; i<=n;i++){
        resulF=resulF*i;
        System.out.println("i="+i+ " resulF="+resulF);
      }
    }
    //Datos de salida
    System.out.println("El faltorial de "+n+"  es:"+resulF);
  }

  static void sumaParesRangoAB(){
    //definir variables y datos de entrada
    System.out.println("Ingrese valor  Inicial A:");
    int a=sc.nextInt();
    System.out.println("Ingrese valor final B:");
    int b=sc.nextInt();
    int suma=0;
    //Proceso
    for(int i=a; i<=b; i++){
      if(i%2==0){
          suma=suma+i;
      }      
    }
    //datos de salida
System.out.println("La suma de numeros pares es:"+suma);

  }

  static void menuOpciones(){
    int opcion=0;
    String msg="Eliga el algoritmo que desea probar\n 1=ssss\n2=Factorial";
    System.out.println(msg);
    opcion=sc.nextInt();

    while(opcion!=0){
        switch(opcion){
            case 1: contarNumMenorCeroMayorCeroWhile(); break;
            case 2:  factorial(); break;
            case 3:  sumaParesRangoAB(); break;
            default: System.out.println("Opcion no existe!");
        }
      System.out.println(msg);
      opcion=sc.nextInt();    
    }
  }

  public static void main(String [] arg){
    menuOpciones();
  }


}

