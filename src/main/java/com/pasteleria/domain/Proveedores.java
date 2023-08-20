
package com.pasteleria.domain;

import jakarta.persistence.*;  
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name="proveedores")
public class Proveedores implements Serializable {
    private static  final long serialVersionUID = 1L;   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="numero_proveedor")  
    private Long numero_proveedor;
    private String nombre_proveedor;

    public Proveedores() {
    }

    public Proveedores(Long numero_proveedor, String nombre_proveedor) {
        this.numero_proveedor = numero_proveedor;
        this.nombre_proveedor = nombre_proveedor;
    }
    
    
}
