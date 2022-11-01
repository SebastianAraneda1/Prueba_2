package cl.duoc.service.app;

import cl.duoc.models.Avion;
import cl.duoc.service.IListAvion;
import java.util.ArrayList;
import java.util.List;

public class ListarAvion implements IListAvion{
    
    private List<Avion> listaAvion;

    public ListarAvion() {
        this.listaAvion = new ArrayList();
    }

    public List<Avion> getListaAvion() {
        return listaAvion;
    }

    public void setListaAvion(List<Avion> listaAvion) {
        this.listaAvion = listaAvion;
    }
	
    @Override
    public void Guardar ( Avion avion ) {
            listaAvion.add(avion);
    }

    @Override
    public void Reemplazar (int indice, Avion avion) {
            for (int i = 0; i < listaAvion.size(); i++) {
                    if (i == indice) {
                            listaAvion.set(i, avion);
                    }
            }
    }

    @Override
    public void Eliminar (int id) {
            for (int i = 0; i < listaAvion.size(); i++) {
                    if ( listaAvion.get(i).getid() == id) {
                            listaAvion.remove(i);
                    }
            }
    }

    @Override
    public void Eliminar (Avion avion) {
            if (listaAvion.indexOf(avion) > -1) {
                    listaAvion.remove(avion);
            }
    }

    @Override
    public void Listar() {
            for (int i = 0; i < listaAvion.size(); i++) {
                    System.out.println("Avion " + i + 1 + "\n");
                    System.out.println("Id: " + listaAvion.get(i).getId() + "\n");
                    System.out.println("Nombre: " + listaAvion.get(i).getNombre() + "\n");
                    System.out.println("Horas Voladas: " + listaAvion.get(i).getHorasVoladas() + "\n");
                    System.out.println("Datos Extras: " + listaAvion.get(i).isDatosExtras() + "\n");
                    System.out.println("Listo para volar: " + listaAvion.get(i).isListoParaVolar() + "\n");
                    System.out.println("Fecha ultimo vuelo: " + listaAvion.get(i).getFechaUltimoVuelo() + "\n");
            }
    }

    @Override
    public void Listar (int index) {
            System.out.println("Avion");
            System.out.println("Id: " + listaAvion.get(index).getId() + "\n");
            System.out.println("Nombre: " + listaAvion.get(index).getNombre() + "\n");
            System.out.println("Horas Voladas: " + listaAvion.get(index).getHorasVoladas() + "\n");
            System.out.println("Datos Extras: " + listaAvion.get(index).isDatosExtras() + "\n");
            System.out.println("Listo para volar: " + listaAvion.get(index).isListoParaVolar() + "\n");
            System.out.println("Fecha ultimo vuelo: " + listaAvion.get(index).getFechaUltimoVuelo() + "\n");
    }
}
