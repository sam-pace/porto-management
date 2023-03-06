package com.porto.web.model.enums;

public enum TipoContainer {
    Vinte("20"), Quarenta("40");

    private String valor;

    private TipoContainer(String valor) {
        this.valor = valor;
    }

    public String getTipoContainer() {
        return valor;

    }
}
