
package com.pasteleria.domain;
import jakarta.persistence.*;  
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name="utensilios")

public class Utensilios {
    private static  final long serialVersionUID = 1L;   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="numero_utensilios")
    private Long numero_utensilios;
    private String nombre_utensilios;

    public Utensilios() {
    }

    public Utensilios(Long numero_utensilios, String nombre_utensilios) {
        this.numero_utensilios = numero_utensilios;
        this.nombre_utensilios = nombre_utensilios;
    }
    
    
}
