package cl.duoc.service;

import cl.duoc.models.Avioneta;

public interface IListAvioneta {
    public void Guardar ( Avioneta avioneta );
    public void Reemplazar (int indice, Avioneta avioneta);
    public void Eliminar (int id);
    public void Eliminar (Avioneta avioneta);
    public void Listar();
    public void Listar (int index);
}
