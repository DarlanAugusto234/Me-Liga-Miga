package com.example.Me.Liga.Miga.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.ElementCollection;

import java.util.ArrayList;
import java.util.List;

public class DTODenuncia {

    @JsonIgnore
    private Integer id;

    @ElementCollection
    private List<String> imagens = new ArrayList<>();

    @JsonIgnore
    private DTOUsuario usuario;

    public DTODenuncia() {
    }

    public List<String> getImagens() {
        return imagens;
    }

    public void setImagens(List<String> imagens) {
        this.imagens = imagens;
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
