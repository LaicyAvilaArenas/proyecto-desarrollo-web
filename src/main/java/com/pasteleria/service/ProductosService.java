/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pasteleria.service;

import com.pasteleria.domain.Productos;
import java.util.List;

public interface ProductosService {
    
    public List<Productos> getProductos();
  //metodos CRUD
  // Se obtiene un Productos, a partir del id de un productos
    public Productos getProductos(Productos productos);
    
    // Se inserta un nuevo productos si el id del productos esta vacío
    // Se actualiza un productos si el id del productos NO esta vacío
    public void save(Productos productos);
    
    // Se elimina el productos que tiene el id pasado por parámetro
    public void delete(Productos productos);
}
