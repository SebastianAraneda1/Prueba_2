package cl.duoc.models;

import cl.duoc.utils.Validaciones;
import java.time.LocalDate;

public class Pasajero {
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

    public Pasajero(int id, String nombre, LocalDate fechanacimiento, int rut, char dv, int telefono, String email, boolean vetado) {
        this.id = id;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.rut = rut;
        this.dv = dv;
        this.telefono = telefono;
        this.email = email;
        this.vetado = vetado;
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
        if(validar.validarRut(rut, this.dv)){
            this.rut = rut;
            setDv(dv);
        }
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
        String tel = Integer.toString(telefono);
        if(tel.length() >= 8 && tel.substring(0, 2).equals("56")){
            this.telefono = telefono;
        }else{
            System.out.println("Debe empezar con 56 y tener 8 caracteres minimo");
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
        
}
