
static void mesdelAnho(){
  //Declarar Variables
  int mesNum; 
  String mesLetra="";
  //Datos de entrada
  System.out.println("Ingrese el numero del mes entre 1-12:");
  mesNum=sc.nextInt();
  //Proceso
  switch(mesNum){
    case 1:  mesLetra="Enero"; break;
    case 2:  mesLetra="Febrero"; break;
    case 3:  mesLetra="Marzo"; break;
    case 4:  mesLetra="Abril"; break;
    case 5:  mesLetra="Mayo"; break;
    case 6:  mesLetra="Junio"; break;
    case 7:  mesLetra="Julio"; break;
    case 8:  mesLetra="Agosto"; break;
    case 9:  mesLetra="Septiembre"; break;
    case 10:  mesLetra="Octubre"; break;
    case 11:  mesLetra="Noviembre"; break;
    case 12:  mesLetra="Diciembre"; break;
    default: 
    mesLetra="No existe";
    System.out.println("El mes no es valido!");break;
  }
  //Datos de salida
  System.out.println("El mes "+mesNum+" es:"+mesLetra);
}

static void menuOpciones(){
int opcion=0;
String msg="Eliga el algoritmo que desea probar\n 1=ssss\n2=zzzz";
System.out.println(msg);
opcion=sc.nextInt();

while(opcion!=0){
    switch(opcion){
        case 1: algoritmoRegalos(); break;
        case 2:  pagoPolizas(); break;
        case 3:  mesdelAnho(); break;
        default: System.out.println("Opcion no existe!");
    }
  System.out.println(msg);
  opcion=sc.nextInt();    
}
}

public static void main(String[] arg){
//algoritmoRegalos();
  //pagoPolizas();
  //mesdelAnho();
  menuOpciones();

}

}