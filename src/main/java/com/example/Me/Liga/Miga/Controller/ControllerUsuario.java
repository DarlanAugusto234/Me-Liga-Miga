package com.example.Me.Liga.Miga.Controller;

import com.example.Me.Liga.Miga.Classes.Usuario;
import com.example.Me.Liga.Miga.DTO.DTOUsuario;
import com.example.Me.Liga.Miga.Services.ServiceUsuario;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerUsuario {

    private ServiceUsuario serviceUsuario;

    public ControllerUsuario(ServiceUsuario serviceUsuario) {
        this.serviceUsuario = serviceUsuario;
    }

    // Cadastrar Usuario
    @PostMapping("/cadastrarUsuario")
    public void cadastrarUsuario(@Valid @RequestBody Usuario usuario) {
        serviceUsuario.cadastrarUsuario(usuario);
    }

    // Listar Todos os Usuarios
    @GetMapping("/listarTodosOsUsuarios")
    public List<DTOUsuario> buscarUsuarios() {
        return serviceUsuario.buscarUsuarios();
    }

    // Procurar Pelo Id do Cliente
    @GetMapping("/procurarUsuarioPeloId/{usuarioId}")
    public Usuario getUsuarioById(@PathVariable Integer usuarioId) {
        return serviceUsuario.procurarUsuarioPorId(usuarioId);
    }

    // Procurar Cliente pelo Nome
    @GetMapping("/procurarClientePeloNome/{nome}")
    public List<Usuario> getUsuarioByNome(@PathVariable String nome) {
        return serviceUsuario.procurarUsuarioPorNome(nome);
    }

}
