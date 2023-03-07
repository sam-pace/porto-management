package com.porto.web.model.enums;

public enum Status {
    CHEIO("cheio"), VAZIO("vazio");

    private String valor;

    private Status(String valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return valor;

    }

}
