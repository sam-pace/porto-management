package com.porto.web.model.enums;

public enum Status {
    Cheio("cheio"), Vazio("Vazio");

    private String valor;

    private Status(String valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return valor;

    }

}
