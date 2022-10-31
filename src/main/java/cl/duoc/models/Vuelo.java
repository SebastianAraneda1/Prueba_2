package cl.duoc.models;

public class Vuelo {
    private int numerovuelo;
    private String suscripcion;
    
    public Vuelo(){
        this.numerovuelo = 0;
        this.suscripcion = "";
    }

    public Vuelo(int numerovuelo, String suscripcion) {
        this.numerovuelo = numerovuelo;
        this.suscripcion = suscripcion;
    }

    public int getNumerovuelo() {
        return numerovuelo;
    }

    public void setNumerovuelo(int numerovuelo) {
        this.numerovuelo = numerovuelo;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }
    
}
