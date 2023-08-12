
package com.pasteleria.Dao;

import com.pasteleria.domain.Pedidos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosDao extends JpaRepository<Pedidos, Long>  {
     
}
