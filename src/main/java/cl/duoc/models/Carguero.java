package cl.duoc.models;

import java.time.LocalDate;

public class Carguero {
    private int ID;
    private String Nombre;
    private int HorasVoladas;
    private boolean ListoParaVolar;
    private int Tonelaje;
    private LocalDate FechaUltimoVuelo;

    public Carguero() {
        this.ID = 0;
        this.Nombre = "";
        this.HorasVoladas = 0;
        this.ListoParaVolar = false;
        this.Tonelaje = 0;
        this.FechaUltimoVuelo = LocalDate.now();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHorasVoladas() {
        return HorasVoladas;
    }

    public void setHorasVoladas(int HorasVoladas) {
        this.HorasVoladas = HorasVoladas;
    }

    public boolean isListoParaVolar() {
        return ListoParaVolar;
    }

    public void setListoParaVolar(boolean ListoParaVolar) {
        this.ListoParaVolar = ListoParaVolar;
    }

    public int getTonelaje() {
        return Tonelaje;
    }

    public void setTonelaje(int Tonelaje) {
        this.Tonelaje = Tonelaje;
    }

    public LocalDate getFechaUltimoVuelo() {
        return FechaUltimoVuelo;
    }

    public void setFechaUltimoVuelo(LocalDate FechaUltimoVuelo) {
        this.FechaUltimoVuelo = FechaUltimoVuelo;
    }
    
}
