package pe.edu.upeu.app;


import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class MenuPrincipal {
    LeerTeclado leer=new LeerTeclado();
    UsuarioDao userDao;
    UtilsX util=new UtilsX();


    public void mainLogin() {
        util.clearConsole();
        System.out.println("**********************System Autenticate*********************");
        System.out.println();
        userDao=new UsuarioDao();
        if(userDao.login()){
            menuMain();
        }else{            
            System.out.println("Intente Nuevamemnte");
            mainLogin();
        }
    }


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
                case 2:{
                    userDao=new UsuarioDao();
                    userDao.listarUsuarios();
                } break;             
                default: System.out.println("Opcion no existe!");
            }        
          opcion=leer.leer(0,msg);
        }        
    }

}
