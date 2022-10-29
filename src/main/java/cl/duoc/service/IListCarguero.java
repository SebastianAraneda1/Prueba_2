
package cl.duoc.service;

import cl.duoc.models.Carguero;

public interface IListCarguero {
    public void Guardar ( Carguero carguero );
    public void Reemplazar (int indice, Carguero carguero);
    public void Eliminar (int id);
    public void Eliminar (Carguero carguero);
    public void Listar();
    public void Listar (int index);
}
