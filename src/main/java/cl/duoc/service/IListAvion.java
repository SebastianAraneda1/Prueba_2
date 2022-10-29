
package cl.duoc.service;

import cl.duoc.models.Avion;

public interface IListAvion {
    public void Guardar ( Avion avion );
    public void Reemplazar (int indice, Avion avion);
    public void Eliminar (int id);
    public void Eliminar (Avion avion);
    public void Listar();
    public void Listar (int index);
}
