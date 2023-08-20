/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pasteleria.service;

import com.pasteleria.domain.Pasteles;
import java.util.List;

public interface PastelesService {
    
    public List<Pasteles> getPasteles();
  //metodos CRUD
  // Se obtiene un Pasteles, a partir del id de un pasteles
    public Pasteles getPasteles(Pasteles pasteles);
    
    // Se inserta un nuevo pasteles si el id del pasteles esta vacío
    // Se actualiza un pasteles si el id del pasteles NO esta vacío
    public void save(Pasteles pasteles);
    
    // Se elimina el pasteles que tiene el id pasado por parámetro
    public void delete(Pasteles pasteles);
}
