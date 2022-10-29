package cl.duoc.service.app;

import cl.duoc.models.Avioneta;
import java.util.List;


public class ListarAvioneta {
    private List<Avioneta> listaAvioneta;
	
    public void Guardar ( Avioneta avioneta ) {
            listaAvioneta.add(avioneta);
    }

    public void Reemplazar (int indice, Avioneta avioneta) {
            for (int i = 0; i < listaAvioneta.size(); i++) {
                    if (i == indice) {
                            listaAvioneta.set(i, avioneta);
                    }
            }
    }

    public void Eliminar (int id) {
            for (int i = 0; i < listaAvioneta.size(); i++) {
                    if ( listaAvioneta.get(i).getId() == id) {
                            listaAvioneta.remove(i);
                    }
            }
    }

    public void Eliminar (Avioneta avioneta) {
            if (listaAvioneta.indexOf(avioneta) > -1) {
                    listaAvioneta.remove(avioneta);
            }
    }

    public void Listar() {
            for (int i = 0; i < listaAvioneta.size(); i++) {
                    System.out.println("Avioneta " + i + 1 + "\n");
                    System.out.println("Id: " + listaAvioneta.get(i).getId() + "\n");
                    System.out.println("Nombre: " + listaAvioneta.get(i).getNombre() + "\n");
                    System.out.println("Horas Voladas: " + listaAvioneta.get(i).getHorasVoladas() + "\n");
                    System.out.println("Ultra Sonico: " + listaAvioneta.get(i).isUltrasonico() + "\n");
                    System.out.println("Listo para volar: " + listaAvioneta.get(i).isListoParaVolar() + "\n");
                    System.out.println("Fecha ultimo vuelo: " + listaAvioneta.get(i).getFechaUltimoVuelo() + "\n");
            }
    }

    public void Listar (int index) {
            System.out.println("Avioneta");
            System.out.println("Id: " + listaAvioneta.get(index).getId() + "\n");
            System.out.println("Nombre: " + listaAvioneta.get(index).getNombre() + "\n");
            System.out.println("Horas Voladas: " + listaAvioneta.get(index).getHorasVoladas() + "\n");
            System.out.println("Ultra Sonico: " + listaAvioneta.get(index).isUltrasonico() + "\n");
            System.out.println("Listo para volar: " + listaAvioneta.get(index).isListoParaVolar() + "\n");
            System.out.println("Fecha ultimo vuelo: " + listaAvioneta.get(index).getFechaUltimoVuelo() + "\n");
    }
}
