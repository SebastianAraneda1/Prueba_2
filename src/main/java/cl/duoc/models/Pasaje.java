package cl.duoc.models;

import java.time.LocalDate;

public class Pasaje extends Pasajero{
    private int id;
    private LocalDate fecha;
    private String codigovuelo;
    private int valor;
    
    public Pasaje(){
        super();
        this.id = 0;
        this.fecha = LocalDate.now();
        this.codigovuelo = "";
        this.valor = 0;
    }

    public Pasaje(int id, LocalDate fecha, String codigovuelo, int valor) {
        this.id = id;
        this.fecha = fecha;
        this.codigovuelo = codigovuelo;
        this.valor = valor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCodigovuelo() {
        return codigovuelo;
    }

    public void setCodigovuelo(String codigovuelo) {
        this.codigovuelo = codigovuelo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
