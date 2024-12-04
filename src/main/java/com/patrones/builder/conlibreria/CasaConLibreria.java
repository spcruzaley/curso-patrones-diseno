package com.patrones.builder.conlibreria;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CasaConLibreria {
    private int puertas;
    private int ventanas;
    private String tipoTecho;
    private boolean tieneGaraje;
}
