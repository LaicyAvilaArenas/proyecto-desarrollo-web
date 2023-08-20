package com.pasteleria.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name = "finanzas")
public class Finanzas {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_mes")
    private Long numero_mes;
    private String gastos;
    private int gastos_entrada;
    private int gastos_salida;

    public Finanzas() {
    }

    public Finanzas(Long numero_mes, String gastos, int gastos_entrada, int gastos_salida) {
        this.numero_mes = numero_mes;
        this.gastos = gastos;
        this.gastos_entrada = gastos_entrada;
        this.gastos_salida = gastos_salida;
    }

}
