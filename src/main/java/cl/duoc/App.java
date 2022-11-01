package cl.duoc;

import cl.duoc.models.Pasajero;
import cl.duoc.models.Vuelo;
import cl.duoc.utils.Validaciones;
import java.time.LocalDate;
import java.util.Scanner;
/**
 * Clase principal
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
         * Hola, lo siento, se que es poco lo que rescaté de la información y poco contexto te dí,
         * pero de verdad necesito tu ayuda.
         * 
         * El programador que teníamos se fué y nos dejó sin nada que probar ni hacer,
         * lo bueno es que tenemos los archivos de TEST que vamos a aplicar, asi que 
         * al menos sabemos el resultado que debiese hacer, pero el cómo se hacía, no hay mucho.
         * 
         * Sientete en libertad de trabajar con alguien más en esto. Te aseguro que valdrá
         * la pena.
         * 
         * Lo necesitamos si o si para antes de la media noche entre el Martes 1ro de Noviembre y el Miércoles
         * 2 de Noviembre. Debe estar operativo y subido en github sino, nada valdrá la pena.
        */
        //System.out.println("hola!");
        boolean continuar = true, registro = false;
        Pasajero p = new Pasajero();
        Scanner sn = new Scanner(System.in);
        Validaciones v = new Validaciones();
        Vuelo vu = new Vuelo();
        
        while (continuar == true){
            if(!registro){
                System.out.println("ingrese nombre: ");
                String nombre = sn.next();
                if(v.ValidarString(3, nombre)){
                    p.setNombre(nombre);
                    System.out.println("Ingrese rut: ");
                    String rut = sn.next();
                    int rutNum = Integer.parseInt(rut.replace("-","").replace(".", "")
                                  .substring(0, (rut.length() - 1)));
                    char dv = rut.substring(rut.length() - 1).charAt(0);
                    if (v.validarRut(rut)) {
                        p.setRut(rutNum);
                        p.setDv(dv);
                        System.out.println("Fecha de nacimiento (DD-MM-YYYY): ");
                        p.setFechanacimiento(p.formatearFecha(sn.next()));
                        System.out.println("Ingrese Telefono (+56): ");
                        int tel = Integer.parseInt(sn.next());
                        p.setTelefono(tel);
                        System.out.println("Ingrese Email: ");
                        String email = sn.next();
                        if (v.ValidarEmail(email)) {
                            p.setEmail(email);            
                            vu.setSuscripcion("Gold");
                            vu.setNumerovuelo(2);
                            System.out.println("\n Nombre pasajero: "+p.getNombre()+
                                    "\n RUT: "+p.getRut()+"-"+p.getDv()+
                                    "\n Fecha de nacimiento: "+p.getFechanacimiento()+
                                    "\n Telefono: "+p.getTelefono()+
                                    "\n Email: "+p.getEmail()+
                                    "\n Suscripcion: "+vu.getSuscripcion()+
                                    "\n Numero de vuelo: "+vu.getNumerovuelo());
                            registro = true;
                            continuar = false;
                        }
                    }
                }
            }// FIN registro            
        }
    }
}