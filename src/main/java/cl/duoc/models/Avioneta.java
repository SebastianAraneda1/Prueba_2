package cl.duoc.models;

public class Avioneta extends VehiculoAereo{
    private int id;
    private boolean ultrasonico;
    
    public void Avioneta(){
        this.id = 0;
        this.ultrasonico = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isUltrasonico() {
        return ultrasonico;
    }

    public void setUltrasonico(boolean ultrasonico) {
        this.ultrasonico = ultrasonico;
    }
}
