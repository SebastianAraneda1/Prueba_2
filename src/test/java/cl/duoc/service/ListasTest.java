package cl.duoc.service;

import org.junit.Test;

import cl.duoc.service.IList;
import cl.duoc.service.app.*;
import cl.duoc.models.*;

public class ListasTest {
    
    @Test
    public void testListas(){
        IListAvion avionList = new ListarAvion();
        IListAvioneta avionetaList = new ListarAvioneta();
        IListCarguero cargueroList = new ListarCarguero();
    }

    @Test
    public void testListaGlobal(){
        IList<VehiculoAereo> avionList = new Listar();
    }

    @Test
    public void testListaGlobal_Funcionamiento(){
        IList<VehiculoAereo> avionList = new Listar();
        avionList.Guardar(new Avion());
        avionList.Guardar(new Avioneta());
        avionList.Guardar(new Carguero());
    }
}
