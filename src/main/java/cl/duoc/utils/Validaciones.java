package cl.duoc.utils;


public class Validaciones {
    
    public boolean ValidarString(String nombre){
        if(nombre.length() > 4){
            System.out.println("El nombre es correcto");
            return true;
        }else{
            System.out.println("El nombre es incorrecto");
            return false;
        }
    }
}
