package cl.duoc.models;

public class Avion extends VehiculoAereo{
    private int ID;
    private String DatosExtras;

    public Avion() {
        this.ID = 0;
        this.DatosExtras = "";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDatosExtras() {
        return DatosExtras;
    }

    public void setDatosExtras(String DatosExtras) {
        this.DatosExtras = DatosExtras;
    }
   
}
