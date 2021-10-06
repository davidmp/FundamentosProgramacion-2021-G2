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

  }









  
