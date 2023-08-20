
package com.pasteleria.Dao;

import com.pasteleria.domain.Pasteles;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PastelesDao extends JpaRepository<Pasteles, Long>  {
     
}
