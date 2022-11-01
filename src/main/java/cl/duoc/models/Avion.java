package cl.duoc.models;

import java.time.LocalDate;

public class Avion extends VehiculoAereo{
    private int id;
    private String DatosExtras;

    public Avion() {
        super();
        this.id = 0;
        this.DatosExtras = "";
    }

    public Avion(int id, String DatosExtras) {
        this.id = id;
        this.DatosExtras = DatosExtras;
    }

    public Avion(String Nombre, int HorasVoladas, boolean ListoParaVolar, LocalDate FechaUltimoVuelo, String DatosExtras) {
        super(Nombre, HorasVoladas, ListoParaVolar, FechaUltimoVuelo);
        this.id = id;
        this.DatosExtras = DatosExtras;
    }
    
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getDatosExtras() {
        return DatosExtras;
    }

    public void setDatosExtras(String DatosExtras) {
        this.DatosExtras = DatosExtras;
    }

    public String isDatosExtras() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    int mil  = 1000;

    public int crearId () {
    int id = mil;
    mil++;
    return id;
    }
    
    @Override
    public String toString(){
        return "El veloz del cielo, #100, ultimo vuelo: 23/05/2022, total de horas: 44, Vuela muy mal";
    }
}
