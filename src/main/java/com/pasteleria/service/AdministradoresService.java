/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pasteleria.service;

import com.pasteleria.domain.Administradores;
import java.util.List;

public interface AdministradoresService {
    
    public List<Administradores> getAdministradores();
  //metodos CRUD
  // Se obtiene un Administradores, a partir del id de un administradores
    public Administradores getAdministradores(Administradores administradores);
    
    // Se inserta un nuevo administradores si el id del administradores esta vacío
    // Se actualiza un administradores si el id del administradores NO esta vacío
    public void save(Administradores administradores);
    
    // Se elimina el administradores que tiene el id pasado por parámetro
    public void delete(Administradores administradores);
}
