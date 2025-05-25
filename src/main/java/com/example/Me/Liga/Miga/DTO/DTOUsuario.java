package com.example.Me.Liga.Miga.DTO;

import com.example.Me.Liga.Miga.Classes.Denuncia;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class DTOUsuario {

    @JsonIgnore
    private Integer id;

    private String nome;

    private String endereco;

    private String cpf;

    private String telefone;

    @JsonIgnore
    private List<DTODenuncia> denuncia;

    public DTOUsuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<DTODenuncia> getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(List<DTODenuncia> denuncia) {
        this.denuncia = denuncia;
    }
}
