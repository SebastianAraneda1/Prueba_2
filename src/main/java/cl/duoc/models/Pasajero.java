package cl.duoc.models;

import cl.duoc.utils.Validaciones;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pasajero{
    private int id;
    private String nombre;
    private LocalDate fechanacimiento;
    private int rut;
    private char dv;
    private int telefono;
    private String email;
    private boolean vetado;
    private Validaciones validar = new Validaciones();
    
    public void pasajero(){
        this.id = 0;
        this.nombre = "";
        this.fechanacimiento = LocalDate.now();
        this.rut= 0;
        this.dv = ' ';
        this.telefono = 0;
        this.email = "";
        this.vetado = false;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
            
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        try{
            String tel = Integer.toString(telefono);
            if(tel.length() == 9){
                this.telefono = telefono;
            }else{
                System.out.println("Debe empezar con 56 y tener 8 caracteres minimo");
            }
        }catch(Exception e){
            
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.length() > 5 && email.contains("@")){
            this.email = email;
        }
    }

    public boolean isVetado() {
        return vetado;
    }

    public void setVetado(boolean vetado) {
        this.vetado = vetado;
    }
    
    public  LocalDate formatearFecha ( String fecha ) {
        LocalDate fechaFormateada;
        DateTimeFormatter formatoDeEntrada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaFormateada = LocalDate.parse(fecha, formatoDeEntrada);
        //System.out.println(fechaFormateada);
        return fechaFormateada;
    }  
            
    int mil  = 1000;

    public int crearId () {
    int id = mil;
    mil++;
    return id;
    }      
}
