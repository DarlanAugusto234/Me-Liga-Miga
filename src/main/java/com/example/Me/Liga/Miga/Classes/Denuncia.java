package com.example.Me.Liga.Miga.Classes;

import com.example.Me.Liga.Miga.Status.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Denuncia extends Pessoa {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    @NotNull
    @Enumerated(EnumType.STRING)
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

    public Denuncia(String nome, LocalDate dataNascimento, String endereco, String telefone, String cpf, Status status, String relato, LocalDateTime dataHora, Usuario usuario) {
        super(nome, dataNascimento, endereco, telefone, cpf);
        this.status = status;
        this.relato = relato;
        this.dataHora = dataHora;
        this.usuario = usuario;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getRelato() {
        return relato;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
