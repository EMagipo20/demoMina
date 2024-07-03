package com.dovit.demomina.dtos;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;

@Data
public class MinaDto {
    private Long id;
    private String nombreMina;
    @Temporal(TemporalType.DATE)
    private Date fechaInicioOperacion;
    private String tipo;
    private int toneladasProducidas;
}
