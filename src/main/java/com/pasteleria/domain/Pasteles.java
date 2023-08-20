
package com.pasteleria.domain;

import jakarta.persistence.*;  
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name="pasteles")
public class Pasteles implements Serializable {
  private static  final long serialVersionUID = 1L;   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="numero_pastel")  
    private Long numero_pastel;
    private String nombre_pastel;

    public Pasteles() {
    }

    public Pasteles(Long numero_pastel, String nombre_pastel) {
        this.numero_pastel = numero_pastel;
        this.nombre_pastel = nombre_pastel;
    }

   
    
    
}
