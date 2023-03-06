package com.porto.web.model.enums;

public enum CategoriaContainer {
    Importacao("improtacao"), Exportacao("exportacao");

    private String valor;

    private CategoriaContainer(String valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return valor;
    }
}
