package com.example.Me.Liga.Miga.Services;

import com.example.Me.Liga.Miga.Classes.Usuario;
import com.example.Me.Liga.Miga.Repository.RepositoryUsuario;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario {

    private RepositoryUsuario repositoryUsuario;

    ModelMapper modelMapper;

    public ServiceUsuario(RepositoryUsuario repositoryUsuario, ModelMapper modelMapper) {
        this.repositoryUsuario = repositoryUsuario;
        this.modelMapper = modelMapper;
    }

    public void CadastrarUsuario (Usuario usuario) {
        repositoryUsuario.save(usuario);
    }

}
