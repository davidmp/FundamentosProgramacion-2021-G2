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
    userTO=new UsuarioTO();
    userTO.setUsuario(leerTecla.leer("", "Ingrese un usuario"));
    userTO.setPassword(leerTecla.leer("", "Ingrese una contraseña"));
    userTO.setPerfil(leerTecla.leer("", "Ingrese un perfil (VENDEDOR/ADMINISTRADOR)"));
    leerArch=new LeerArchivo(TABLE_USER);
    agregarContenido(leerArch, userTO);
}



}
