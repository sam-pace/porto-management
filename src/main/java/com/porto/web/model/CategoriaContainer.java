package com.porto.web.model;

public enum CategoriaContainer {
    Importacao("importacao"), Exportacao("exportacao");

    private String valor;

    private CategoriaContainer(String valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return valor;
    }
}
