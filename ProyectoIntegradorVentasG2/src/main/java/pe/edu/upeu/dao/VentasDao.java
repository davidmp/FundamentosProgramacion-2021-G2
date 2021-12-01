package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ClienteTO;
import pe.edu.upeu.modelo.DescuentoTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VentasDao extends AppCrud{
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();
    
    LeerArchivo leerArch;
    ProductoTO prodTO;
    ClienteTO cliTO;
    VentaTO ventTO;
    VentaDetalleTO vdTO;
    DescuentoTO desTO;
    
    final String TABLE_PRODUCTO="Producto.txt";   
    final String TABLE_CLIENTE="Cliente.txt";   
    final String TABLE_VENTA="Venta.txt";   
    final String TABLE_DETALLE_VENTA="VentaDetalle.txt";     

    public void registroVenta() {
        leerArch=new LeerArchivo(TABLE_VENTA);
        System.out.println("*******************Venta Zapatillas***************");
        String dni=crearCliente(leerTecla.leer("", "Ingrese el DNI del Cliente"));
        VentaTO ventaTO=crearVenta(dni);
        if (ventaTO!=null) {
            String opcion="SI";
            do {
                VentaDetalleTO vdXTo=crearCarritoVenta();
                
            } while (opcion.toUpperCase().equals("SI"));
        }
        
    }

    public VentaTO crearVenta(String dni) {
        
        return null;
    }
    public VentaDetalleTO crearCarritoVenta() {
        return null;
    }    

    public void mostrarProducto() {
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
       Object[][] dataPro= listarContenido(leerArch);
       for (int i = 0; i < dataPro.length; i++) {
           System.out.print(dataPro[i][0]+"="+dataPro[i][1]+
           " (Precio:"+(
            Double.parseDouble(String.valueOf(dataPro[i][6])) +
            Double.parseDouble(String.valueOf(dataPro[i][9])))+
            "/ Stock:"+dataPro[i][7]+")\t ! " );
       }
       System.out.println("\n");
    }   
    
    public String crearCliente(String dni) {
        leerArch=new LeerArchivo(TABLE_CLIENTE);
        Object[][] datCli= buscarContenido(leerArch, 0, dni);
        if(datCli!=null){
            return dni;
        }else{
            leerArch=new LeerArchivo(TABLE_CLIENTE);
            cliTO=new ClienteTO();
            cliTO.setDni(dni);
            cliTO.setNombre(leerTecla.leer("", "Ingrese nombre cliente"));
            agregarContenido(leerArch, cliTO);
            return cliTO.getDni();
        }       
    }        

}
