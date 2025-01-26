package com.mark.api.github.scan.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum StatusScan {
    ATIVO("Ativo"),
    INATIVO("Inativo"),
    FINALIZADO("Finalizado");

    private String descricao;

    StatusScan(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
