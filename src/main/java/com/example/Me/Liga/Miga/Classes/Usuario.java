package com.example.Me.Liga.Miga.Classes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Usuario extends Pessoa {

    @NotBlank(message = "O Email do Cliente não pode estar em branco")
    @Email(message = "O Email do Cliente deve ser válido")
    private String emailUsuario;

    @NotBlank(message = "A Senha não pode estar em branco")
    @Size(min = 8, max = 20, message = "A Senha deve ter entre 8 e 20 caracteres")
    @Pattern(
            // COMENTAR AQUI
            regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d{4,}).{8,20}$",
            message = "Sua Senha deve conter pelo menos uma letra maiúscula, uma letra minúscula e quatro números")
    private String senhaUsuario;

    @JsonIgnore
    @OneToMany
    private List<Denuncia> denuncia;

    public Usuario() {
    }

    public Usuario(String emailUsuario, String senhaUsuario) {
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

}
