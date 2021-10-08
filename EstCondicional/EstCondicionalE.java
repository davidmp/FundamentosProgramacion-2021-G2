<<<<<<< HEAD
import java.util.Scanner;

public class EstCondicionalE{

static Scanner sc = new Scanner(System.in);

static void ventalapices(){

  //DEFINIR VARIABLES
  int cantidadlap;
  double pago;

  //DATOS DE ENTRADA
  System.out.println("Ingrese cantidad de lapices:");
  cantidadlap=sc.nextInt();

  //PROCESO

 if (cantidadlap>=1000) {
 pago=cantidadlap*=0.85;
} else {
  pago=cantidadlap*0.90;
}
  //DATOS DE SALIDA
    System.out.println("El pago a realizar es:"+pago);
}


  public static void main(String[] args) {

    System.out.println("Hello World");
    ventalapices();

=======
import java.util.Scanner; 
public class EstCondicionalE{
  static Scanner sc = new Scanner(System.in);

  static void ventaLapices(){
    //Definir Variables
    int cantidadLap;
    double pago;
    //Datos entrada
    System.out.println("Ingrese la cantidad de Lapices a comprar:");
    cantidadLap=sc.nextInt();
    //Proceso
    if (cantidadLap>=1000) {
      pago=cantidadLap*0.85;
    } else {
      pago=cantidadLap*0.90;
    }
    //Datos de Salida
    System.out.println("El pago a realizar es:"+pago);
>>>>>>> 8aefde6668dfabf980c0fe6c2b5d556fddb9e7c0
  }




<<<<<<< HEAD





  
=======
  public static void main(String[] args) {    
    System.out.println("Hello World");   
    ventaLapices();

  }
  
}
>>>>>>> 8aefde6668dfabf980c0fe6c2b5d556fddb9e7c0
