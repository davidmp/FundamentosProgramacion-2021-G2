package pe.edu.upeu.dao;

import pe.edu.upeu.modelo.ClienteTO;
import pe.edu.upeu.modelo.DescuentoTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VentasDao {
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
        
    }

    public VentaTO crearVenta() {
        
        return null;
    }
    public VentaDetalleTO crearCarritoVenta() {
        return null;
    }    

    public void mostrarProducto() {
        
    }   
    
    public String crearCliente() {
        return "";
    }        

}
