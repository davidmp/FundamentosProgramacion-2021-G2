package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class UsuarioDao extends AppCrud {
    
LeerTeclado leerTecla=new LeerTeclado();
UtilsX util=new UtilsX();

LeerArchivo leerArch;
UsuarioTO userTO;
final String TABLE_USER="Usuario.txt";

public void registrarNuevoUsuario() {
    leerArch=new LeerArchivo(TABLE_USER);
}



}
