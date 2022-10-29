package cl.duoc.models;

import java.time.LocalDate;

public class Avion {
    private int ID;
    private String Nombre;
    private int HorasVoladas;
    private boolean ListoParaVolar;
    private String DatosExtras;
    private LocalDate FechaUltimoVuelo;

    public Avion() {
        this.ID = 0;
        this.Nombre = "";
        this.HorasVoladas = 0;
        this.ListoParaVolar = false;
        this.DatosExtras = "";
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

    public String getDatosExtras() {
        return DatosExtras;
    }

    public void setDatosExtras(String DatosExtras) {
        this.DatosExtras = DatosExtras;
    }

    public LocalDate getFechaUltimoVuelo() {
        return FechaUltimoVuelo;
    }

    public void setFechaUltimoVuelo(LocalDate FechaUltimoVuelo) {
        this.FechaUltimoVuelo = FechaUltimoVuelo;
    } 
}
