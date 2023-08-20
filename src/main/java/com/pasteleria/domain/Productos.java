
package com.pasteleria.domain;
import jakarta.persistence.*;  
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name="productos")
public class Productos implements Serializable {
    private static  final long serialVersionUID = 1L;   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="numero_productos")  
    private Long numero_productos;
    private Date fecha_vencimiento;
    private String nombre_productos;

    public Productos() {
    }

    public Productos(Long numero_productos, Date fecha_vencimiento, String nombre_productos) {
        this.numero_productos = numero_productos;
        this.fecha_vencimiento = fecha_vencimiento;
        this.nombre_productos = nombre_productos;
    }
    
    
}
