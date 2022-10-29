package cl.duoc.service.app;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import cl.duoc.models.Avion;
import cl.duoc.models.Avioneta;
import cl.duoc.models.VehiculoAereo;
import cl.duoc.service.IList;

public class ListarTest {
    IList<VehiculoAereo> listar;
    Avion avion;
    Avioneta avioneta;
    int id;

    @Before
    public void setup(){
        avion = new Avion();
        avioneta = new Avioneta();
        listar = new Listar();
        id = 0;
    }

    @Test
    public void Guardar_NotException(){
        listar.Guardar(avioneta);
    }
    @Test
    public void Modificar_NotException(){
        listar.Guardar(avioneta);
        listar.Reemplazar(0, avion);
    }
    @Test
    public void Listar_NotException(){
        listar.Listar();
    }
    @Test
    public void ListarUno_NotException(){
        listar.Guardar(avioneta);
        listar.Listar(0);
    }
    @Test
    public void BorrarPorID_NotException(){
        listar.Guardar(avioneta);
        listar.Eliminar(0);
    }
    @Test
    public void BorrarPorObjeto_NotException(){
        listar.Guardar(avioneta);
        listar.Eliminar(avioneta);
    }
}
