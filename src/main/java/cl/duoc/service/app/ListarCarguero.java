
package cl.duoc.service.app;

import cl.duoc.models.Carguero;
import java.util.List;

public class ListarCarguero {
    private List<Carguero> listaCarguero;
	
    public void Guardar ( Carguero carguero ) {
            listaCarguero.add(carguero);
    }

    public void Reemplazar (int indice, Carguero carguero) {
            for (int i = 0; i < listaCarguero.size(); i++) {
                    if (i == indice) {
                            listaCarguero.set(i, carguero);
                    }
            }
    }

    public void Eliminar (int id) {
            for (int i = 0; i < listaCarguero.size(); i++) {
                    if (listaCarguero.get(i).getid() == id){
                            listaCarguero.remove(i);
                    }
            }
    }

    public void Eliminar (Carguero carguero) {
            if ( listaCarguero.indexOf(carguero) > -1) {
                    listaCarguero.remove(carguero);
            }
    }

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
