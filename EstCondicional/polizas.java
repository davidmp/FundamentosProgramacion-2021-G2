
static void pagoPolizas(){
  //Declarar Variebles
  String plan, alcohol, lentes, enfermedad;
  int edad; 
  double costoPago, recargos=0;
  //Datos de entrada
  System.out.println("Ingrese el Plan (A/B):");
  plan=sc.next();
  System.out.println("Consume Alcohol? (S/N):");
  alcohol=sc.next();
  System.out.println("Usa lentes? (S/N):");
  lentes=sc.next();
  System.out.println("Tiene alguna enfermedad? (S/N):");
  enfermedad=sc.next();    
  System.out.println("Ingrese su edad?:");
  edad=sc.nextInt();       
  //Proceso
  if(alcohol.equals("S")){recargos+=0.10;}
  if(lentes.equals("S")){recargos+=0.05;}
  if(enfermedad.equals("S")){recargos+=0.05;}
  if(edad>40){recargos+=0.20;}else{recargos+=0.10;}

  if(plan.equals("A")){ costoPago=1200+1200*recargos;}
  else{
      costoPago=950+950*recargos;
  }
  //Datos de salida
  System.out.println("Ud. debe pagar el monto de: $ "+costoPago);
}
