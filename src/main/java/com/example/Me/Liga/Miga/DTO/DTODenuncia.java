package com.example.Me.Liga.Miga.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DTODenuncia {

    @JsonIgnore
    private Integer id;

    private String relato;

    private Integer usuarioId;

    public DTODenuncia() {
    }

    public String getRelato() {
        return relato;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
