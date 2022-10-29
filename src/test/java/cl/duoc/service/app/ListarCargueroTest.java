package cl.duoc.service.app;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import cl.duoc.models.Carguero;
import cl.duoc.models.VehiculoAereo;
import cl.duoc.service.IListCarguero;

public class ListarCargueroTest {
    IListCarguero listar;
    Carguero Carguero;

    @Before
    public void setup(){
        Carguero = new Carguero();
        listar = new ListarCarguero();
    }

    @Test
    public void Guardar_NotException(){
        listar.Guardar(Carguero);
    }
    @Test
    public void Modificar_NotException(){
        listar.Guardar(Carguero);
        listar.Reemplazar(0, Carguero);
    }
    @Test
    public void Listar_NotException(){
        listar.Listar();
    }
    @Test
    public void ListarUno_NotException(){
        listar.Guardar(Carguero);
        listar.Listar(0);
    }
    @Test
    public void BorrarPorID_NotException(){
        listar.Guardar(Carguero);
        listar.Eliminar(0);
    }
    @Test
    public void BorrarPorObjeto_NotException(){
        listar.Guardar(Carguero);
        listar.Eliminar(Carguero);
    }
}