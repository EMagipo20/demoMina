package com.dovit.demomina.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombreMina;

    @Column(name = "FechaInicioOperacion",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicioOperacion;

    @Column(name = "tipo",nullable = false)
    private String tipo;

    @Column(name = "Toneladas",nullable = false)
    private int toneladasProducidas;
}