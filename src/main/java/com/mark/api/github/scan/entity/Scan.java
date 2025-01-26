package com.mark.api.github.scan.entity;


import com.mark.api.github.scan.enums.StatusScan;
import com.mark.api.github.scan.enums.TipoScan;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "scan")
public class Scan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(name = "data_criacao")
    private LocalDateTime dataCricao = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private TipoScan tipo;

    @Enumerated(EnumType.STRING)
    private StatusScan status;

    private String image;

    public Scan() {}

    public Scan(String title, TipoScan tipoScan, StatusScan statusScan, String image) {
        this.title = title;
        this.tipo = tipoScan;
        this.status = statusScan;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TipoScan getTipo() {
        return tipo;
    }

    public void setTipo(TipoScan tipo) {
        this.tipo = tipo;
    }

    public StatusScan getStatus() {
        return status;
    }

    public void setStatus(StatusScan status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataCricao() {
        return dataCricao;
    }

    public void setDataCricao(LocalDateTime dataCricao) {
        this.dataCricao = dataCricao;
    }
}
