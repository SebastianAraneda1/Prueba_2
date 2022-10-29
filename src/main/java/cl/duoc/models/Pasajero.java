package cl.duoc.models;

import java.time.LocalDate;

public class Pasajero {
    private int id;
    private String nombre;
    private LocalDate fechanacimiento;
    private String rut;
    private int telefono;
    private String email;
    private boolean vetado;
    
    public void pasajero(){
        this.id = 0;
        this.nombre = "";
        this.fechanacimiento = LocalDate.now();
        this.rut= "";
        this.telefono = 0;
        this.email = "";
        this.vetado = false;
    }

    public Pasajero(int id, String nombre, LocalDate fechanacimiento, String rut, int telefono, String email, boolean vetado) {
        this.id = id;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.rut = rut;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVetado() {
        return vetado;
    }

    public void setVetado(boolean vetado) {
        this.vetado = vetado;
    }
    
    
}
