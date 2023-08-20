/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pasteleria.service;

import com.pasteleria.domain.Categorias;
import java.util.List;

public interface CategoriasService {
    
    public List<Categorias> getCategorias();
  //metodos CRUD
  // Se obtiene un Categorias, a partir del id de un categorias
    public Categorias getCategorias(Categorias categorias);
    
    // Se inserta un nuevo categorias si el id del categorias esta vacío
    // Se actualiza un categorias si el id del categorias NO esta vacío
    public void save(Categorias categorias);
    
    // Se elimina el categorias que tiene el id pasado por parámetro
    public void delete(Categorias categorias);
}
