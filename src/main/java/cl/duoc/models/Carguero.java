package cl.duoc.models;

public class Carguero extends VehiculoAereo{
    private int ID;
    private int Tonelaje;

    public Carguero(){
        this.ID = 0;
        this.Tonelaje = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTonelaje() {
        return Tonelaje;
    }

    public void setTonelaje(int Tonelaje) {
        this.Tonelaje = Tonelaje;
    }

}
    

   