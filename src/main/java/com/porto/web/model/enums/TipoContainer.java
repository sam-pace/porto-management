package com.porto.web.model.enums;

public enum TipoContainer {
    VINTE(20), QUARENTA(40);

    private int valor;

    private TipoContainer(int valor) {
        this.valor = valor;
    }

    public int getTipoContainer() {
        return valor;

    }
}
