package com.mark.api.github.scan.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoScan {
    MANGA("Mangá"),
    MANHWA("Manhwa"),
    WEBTOON("Webtoon");


    private final String descricao;

    TipoScan(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
