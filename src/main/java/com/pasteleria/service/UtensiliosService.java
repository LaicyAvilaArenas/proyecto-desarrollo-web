/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pasteleria.service;

import com.pasteleria.domain.Utensilios;
import java.util.List;

public interface UtensiliosService {
    
    public List<Utensilios> getUtensilios();
  //metodos CRUD
  // Se obtiene un Utensilios, a partir del id de un utensilios
    public Utensilios getUtensilios(Utensilios utensilios);
    
    // Se inserta un nuevo utensilios si el id del utensilios esta vacío
    // Se actualiza un utensilios si el id del utensilios NO esta vacío
    public void save(Utensilios utensilios);
    
    // Se elimina el utensilios que tiene el id pasado por parámetro
    public void delete(Utensilios utensilios);
}
