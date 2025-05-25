package com.example.Me.Liga.Miga.Classes;

import com.example.Me.Liga.Miga.Status.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Denuncia extends Pessoa {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    @ElementCollection
    private List<String> imagens = new ArrayList<>();

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @JoinColumn(name = "usuario_id")
    @ManyToOne
    private List<Usuario> usuario;

    public Denuncia() {
    }

    public Denuncia(Integer id, List<String> imagens) {
        this.id = id;
        this.imagens = imagens;
    }

    public Denuncia(String nome, LocalDate dataNascimento, String endereco, String telefone, String cpf, Integer id, List<String> imagens) {
        super(nome, dataNascimento, endereco, telefone, cpf);
        this.id = id;
        this.imagens = imagens;
    }



}
