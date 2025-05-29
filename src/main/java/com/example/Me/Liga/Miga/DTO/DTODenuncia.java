package com.example.Me.Liga.Miga.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DTODenuncia {

    @JsonIgnore
    private Integer id;

    @JsonIgnore
    private DTOUsuario usuario;

    public DTODenuncia() {
    }

    public DTOUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(DTOUsuario usuario) {
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
