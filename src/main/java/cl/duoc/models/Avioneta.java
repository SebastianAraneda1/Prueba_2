package cl.duoc.models;

import java.time.LocalDate;

public class Avioneta {
    private int id;
    private String nombre;
    private int horasvoladas;
    private boolean ultrasonico;
    private boolean listoparavolar;
    private LocalDate fechaultimovuelo;
    
    public void Avioneta(){
        this.id = 0;
        this.nombre = "";
        this.horasvoladas = 0;
        this.ultrasonico = false;
        this.listoparavolar = false;
        this.fechaultimovuelo = LocalDate.now();
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

    public int getHorasvoladas() {
        return horasvoladas;
    }

    public void setHorasvoladas(int horasvoladas) {
        this.horasvoladas = horasvoladas;
    }

    public boolean isUltrasonico() {
        return ultrasonico;
    }

    public void setUltrasonico(boolean ultrasonico) {
        this.ultrasonico = ultrasonico;
    }

    public boolean isListoparavolar() {
        return listoparavolar;
    }

    public void setListoparavolar(boolean listoparavolar) {
        this.listoparavolar = listoparavolar;
    }

    public LocalDate getFechaultimovuelo() {
        return fechaultimovuelo;
    }

    public void setFechaultimovuelo(LocalDate fechaultimovuelo) {
        this.fechaultimovuelo = fechaultimovuelo;
    }
    
    
}
