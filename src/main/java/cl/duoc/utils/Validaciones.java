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
    
    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}
