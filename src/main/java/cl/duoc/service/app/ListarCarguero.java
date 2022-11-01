
package cl.duoc.service.app;

import cl.duoc.models.Carguero;
import cl.duoc.service.IListCarguero;
import java.util.ArrayList;
import java.util.List;

public class ListarCarguero implements IListCarguero{
    private List<Carguero> listaCarguero;

    public ListarCarguero() {
        this.listaCarguero = new ArrayList();
    }

    public List<Carguero> getListaCarguero() {
        return listaCarguero;
    }

    public void setListaCarguero(List<Carguero> listaCarguero) {
        this.listaCarguero = listaCarguero;
    }
    	
    @Override
    public void Guardar ( Carguero carguero ) {
            listaCarguero.add(carguero);
    }

    @Override
    public void Reemplazar (int indice, Carguero carguero) {
            for (int i = 0; i < listaCarguero.size(); i++) {
                    if (i == indice) {
                            listaCarguero.set(i, carguero);
                    }
            }
    }

    @Override
    public void Eliminar (int id) {
            for (int i = 0; i < listaCarguero.size(); i++) {
                    if (listaCarguero.get(i).getid() == id){
                            listaCarguero.remove(i);
                    }
            }
    }

    @Override
    public void Eliminar (Carguero carguero) {
            if ( listaCarguero.indexOf(carguero) > -1) {
                    listaCarguero.remove(carguero);
            }
    }

    @Override
    public void Listar() {
            for (int i = 0; i < listaCarguero.size(); i++) {
                    System.out.println("Carguero " + i + 1 + "\n");
                    System.out.println("Id: " + listaCarguero.get(i).getid() + "\n");
                    System.out.println("Nombre: " + listaCarguero.get(i).getNombre() + "\n");
                    System.out.println("Horas Voladas: " + listaCarguero.get(i).getHorasVoladas() + "\n");
                    System.out.println("Tonelaje: " + listaCarguero.get(i).isTonelaje() + "\n");
                    System.out.println("Listo para volar: " + listaCarguero.get(i).isListoParaVolar() + "\n");
                    System.out.println("Fecha ultimo vuelo: " + listaCarguero.get(i).getFechaUltimoVuelo() + "\n");
            }
    }

    @Override
    public void Listar (int index) {
            System.out.println("Carguero");
            System.out.println("Id: " + listaCarguero.get(index).getid() + "\n");
            System.out.println("Nombre: " + listaCarguero.get(index).getNombre() + "\n");
            System.out.println("Horas Voladas: " + listaCarguero.get(index).getHorasVoladas() + "\n");
            System.out.println("Tonelaje: " + listaCarguero.get(index).isTonelaje() + "\n");
            System.out.println("Listo para volar: " + listaCarguero.get(index).isListoParaVolar() + "\n");
            System.out.println("Fecha ultimo vuelo: " + listaCarguero.get(index).getFechaUltimoVuelo() + "\n");
    }
}
