
package com.pasteleria.domain;


import jakarta.persistence.*;  
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name="pedidos")
public class Pedidos implements Serializable{
private static  final long serialVersionUID = 1L;   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="numero_pedido")
    private Long numero_pedido;
private String nombre_cliente;
 private String telefono;
 private Date fecha_entrega;
private String descripcion;


    public Pedidos() {
    }

    public Pedidos(String nombre_cliente, String telefono, Date fecha_entrega, String descripcion) {
        this.nombre_cliente = nombre_cliente;
        this.telefono = telefono;
        this.fecha_entrega = fecha_entrega;
        this.descripcion = descripcion;
    }
}

