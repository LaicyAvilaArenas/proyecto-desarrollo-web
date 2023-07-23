 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pasteleria.service;
import com.pasteleria.domain.Pedidos;
import java.util.List;

public interface PedidosService {
  public List<Pedidos> getPedidoss(boolean activos);  
  
  //metodos CRUD
  // Se obtiene un Pedidos, a partir del id de un pedidos
    public Pedidos getPedidos(Pedidos pedidos);
    
    // Se inserta un nuevo pedidos si el id del pedidos esta vacío
    // Se actualiza un pedidos si el id del pedidos NO esta vacío
    public void save(Pedidos pedidos);
    
    // Se elimina el pedidos que tiene el id pasado por parámetro
    public void delete(Pedidos pedidos);
}
