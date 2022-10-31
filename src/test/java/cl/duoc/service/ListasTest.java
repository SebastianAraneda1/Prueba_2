package cl.duoc.service;

import org.junit.Test;

import cl.duoc.service.IList;
import cl.duoc.service.app.*;
import cl.duoc.models.*;

public class ListasTest {
    
    @Test
    public void testListas(){
        IListAvion avionList = (IListAvion) new ListarAvion();
        IListAvioneta avionetaList = (IListAvioneta) new ListarAvioneta();
        IListCarguero cargueroList = (IListCarguero) new ListarCarguero();
    }

    @Test
    public void testListaGlobal(){
        IList<VehiculoAereo> avionList = (IList<VehiculoAereo>) new Listar();
    }

    @Test
    public void testListaGlobal_Funcionamiento(){
        IList<VehiculoAereo> avionList = (IList<VehiculoAereo>) new Listar();
        avionList.Guardar(new Avion());
        avionList.Guardar(new Avioneta());
        avionList.Guardar(new Carguero());
    }
}
