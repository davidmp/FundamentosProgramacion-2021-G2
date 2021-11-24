package pe.edu.upeu.app;

import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.util.LeerTeclado;

public class MenuPrincipal {
    LeerTeclado leer=new LeerTeclado();
    UsuarioDao userDao;

    public MenuPrincipal(){ menuMain();  }

    public void menuMain() {
        int opcion=0;
        System.out.println("================Bienvenidos al Sistema============");
        String msg="Seleccione una opción"+
        "\n1=Nuevo Usuario"    
        +"\n2=Listar Usuario";    
        opcion=leer.leer(0,msg);
        while(opcion!=0){
            switch(opcion){
                case 1:{ 
                    userDao=new UsuarioDao();
                    userDao.registrarNuevoUsuario();
                 }
                break;             
                default: System.out.println("Opcion no existe!");
            }        
          opcion=leer.leer(0,msg);
        }        
    }
}
