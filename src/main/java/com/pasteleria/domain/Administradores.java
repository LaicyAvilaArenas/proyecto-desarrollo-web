
package com.pasteleria.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name = "administradores")
public class Administradores {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_admin")
    private Long numero_admin;
    private String nombre_admin;

    public Administradores() {
    }

    public Administradores(Long numero_admin, String nombre_admin) {
        this.numero_admin = numero_admin;
        this.nombre_admin = nombre_admin;
    }
    
    
}
