/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pasteleria.service;

import com.pasteleria.domain.Finanzas;
import java.util.List;

public interface FinanzasService {
    
    public List<Finanzas> getFinanzas();
  //metodos CRUD
  // Se obtiene un Finanzas, a partir del id de un finanzas
    public Finanzas getFinanzas(Finanzas finanzas);
    
    // Se inserta un nuevo finanzas si el id del finanzas esta vacío
    // Se actualiza un finanzas si el id del finanzas NO esta vacío
    public void save(Finanzas finanzas);
    
    // Se elimina el finanzas que tiene el id pasado por parámetro
    public void delete(Finanzas finanzas);
}
