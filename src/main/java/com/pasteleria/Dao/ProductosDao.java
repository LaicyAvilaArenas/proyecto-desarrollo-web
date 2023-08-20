
package com.pasteleria.Dao;

import com.pasteleria.domain.Productos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosDao extends JpaRepository<Productos, Long>  {
     
}
