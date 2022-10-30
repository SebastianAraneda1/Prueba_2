
package cl.duoc.models;

import cl.duoc.utils.Validaciones;
import java.time.LocalDate;

public class VehiculoAereo {
    private String Nombre;
    private int HorasVoladas;
    private boolean ListoParaVolar;
    private LocalDate FechaUltimoVuelo;
    private Validaciones validaciones = new Validaciones();

    public VehiculoAereo(String Nombre, int HorasVoladas, boolean ListoParaVolar, LocalDate FechaUltimoVuelo) {
        this.Nombre = Nombre;
        this.HorasVoladas = HorasVoladas;
        this.ListoParaVolar = ListoParaVolar;
        this.FechaUltimoVuelo = FechaUltimoVuelo;
    }

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
        if (validaciones.ValidarString(Nombre)){
            this.Nombre = Nombre;
        }else{
            System.out.println("");
        }
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
