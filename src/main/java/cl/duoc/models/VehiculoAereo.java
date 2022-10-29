
package cl.duoc.models;

import java.time.LocalDate;

public class VehiculoAereo {
    private String Nombre;
    private int HorasVoladas;
    private boolean ListoParaVolar;
    private LocalDate FechaUltimoVuelo;

    public VehiculoAereo() {
        this.Nombre = "";
        this.HorasVoladas = 0;
        this.ListoParaVolar = false;
        this.FechaUltimoVuelo = LocalDate.now();
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

    public LocalDate getFechaUltimoVuelo() {
        return FechaUltimoVuelo;
    }

    public void setFechaUltimoVuelo(LocalDate FechaUltimoVuelo) {
        this.FechaUltimoVuelo = FechaUltimoVuelo;
    }
    
    
    
    
}
