package com.example.Me.Liga.Miga.Services;

import com.example.Me.Liga.Miga.Classes.Usuario;
import com.example.Me.Liga.Miga.DTO.DTOUsuario;
import com.example.Me.Liga.Miga.Repository.RepositoryUsuario;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceUsuario {

    private RepositoryUsuario repositoryUsuario;

    ModelMapper modelMapper;

    public ServiceUsuario(RepositoryUsuario repositoryUsuario, ModelMapper modelMapper) {
        this.repositoryUsuario = repositoryUsuario;
        this.modelMapper = modelMapper;
    }

    // Cadastrar Usuario
    public void CadastrarUsuario (Usuario usuario) {
        repositoryUsuario.save(usuario);
    }

    // Buscar Usuarios
    public List<DTOUsuario> buscarUsuarios() {
        List<DTOUsuario> DTOusuarios = new ArrayList<>();
        List<Usuario> usuarios = repositoryUsuario.findAll();

        for (Usuario usuario : usuarios) {
            DTOusuarios.add(modelMapper.map(usuario, DTOUsuario.class));
        }

        return DTOusuarios;
    }

    // Deletar Usuario pelo Id
    public void deletarUsuario(Integer id){
        repositoryUsuario.deleteById(id);
    }

    // Procurar Usuario por ID
    public Usuario procurarUsuarioPorId(Integer usuarioId) {
        return repositoryUsuario.findById(usuarioId).orElseThrow();
    }

    // Procurar Usuario por Nome
    public List<Usuario> procurarUsuarioPorNome(String nome) {
        return repositoryUsuario.findByNomeContainingIgnoreCase(nome);
    }

}
