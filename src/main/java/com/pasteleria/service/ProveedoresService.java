/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pasteleria.service;

import com.pasteleria.domain.Proveedores;
import java.util.List;

public interface ProveedoresService {
    
    public List<Proveedores> getProveedores();
  //metodos CRUD
  // Se obtiene un Proveedores, a partir del id de un proveedores
    public Proveedores getProveedores(Proveedores proveedores);
    
    // Se inserta un nuevo proveedores si el id del proveedores esta vacío
    // Se actualiza un proveedores si el id del proveedores NO esta vacío
    public void save(Proveedores proveedores);
    
    // Se elimina el proveedores que tiene el id pasado por parámetro
    public void delete(Proveedores proveedores);
}
