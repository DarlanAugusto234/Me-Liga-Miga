package com.example.Me.Liga.Miga.Classes;

import com.example.Me.Liga.Miga.Status.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
public class Denuncia {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @NotBlank(message = "O Relato não pode estar em Branco")
    @Size(min = 30, max = 260, message = "O Relato tem que ter no Min 30 e no Max 260+ caracteres")
    private String relato;

    @Column(updatable = false)
    private LocalDateTime dataHora = LocalDateTime.now();

    @JoinColumn(name = "usuario_id")
    @ManyToOne
    private Usuario usuario;

    public Denuncia() {
    }

    public Denuncia(Status status, String relato, LocalDateTime dataHora) {
        this.status = status;
        this.relato = relato;
        this.dataHora = dataHora;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getRelato() {
        return relato;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
