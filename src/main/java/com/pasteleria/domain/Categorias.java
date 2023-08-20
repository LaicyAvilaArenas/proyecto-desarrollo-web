
package com.pasteleria.domain;

import jakarta.persistence.*;  
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name="categorias")
public class Categorias {
    private static  final long serialVersionUID = 1L;   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="numero_categoria")  
    private Long numero_categoria;
    private String tipo_categoria;
    private String nombre_categoria;

    public Categorias() {
    }

    public Categorias(Long numero_categoria, String tipo_categoria, String nombre_categoria) {
        this.numero_categoria = numero_categoria;
        this.tipo_categoria = tipo_categoria;
        this.nombre_categoria = nombre_categoria;
    }
    
    
}
