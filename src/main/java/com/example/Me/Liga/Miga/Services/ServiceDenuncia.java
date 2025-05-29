package com.example.Me.Liga.Miga.Services;

import com.example.Me.Liga.Miga.Classes.Denuncia;
import com.example.Me.Liga.Miga.Classes.Usuario;
import com.example.Me.Liga.Miga.DTO.DTODenuncia;
import com.example.Me.Liga.Miga.Repository.RepositoryDenuncia;
import com.example.Me.Liga.Miga.Repository.RepositoryUsuario;
import com.example.Me.Liga.Miga.Status.Status;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ServiceDenuncia {

    RepositoryUsuario repositoryUsuario;
    RepositoryDenuncia repositoryDenuncia;
    ModelMapper modelMapper;

    public ServiceDenuncia(RepositoryUsuario repositoryUsuario, ModelMapper modelMapper, RepositoryDenuncia repositoryDenuncia) {
        this.repositoryUsuario = repositoryUsuario;
        this.modelMapper = modelMapper;
        this.repositoryDenuncia = repositoryDenuncia;
    }

    // Salvar a Denuncia
    public Denuncia salvarDenuncia(DTODenuncia dtoDenuncia) {
        Usuario usuario = repositoryUsuario.findById(dtoDenuncia.getUsuarioId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Denuncia denuncia = new Denuncia();
        denuncia.setRelato(dtoDenuncia.getRelato());
        denuncia.setUsuario(usuario); // associa o objeto Usuario inteiro
        denuncia.setStatus(Status.ENVIADO);

        return repositoryDenuncia.save(denuncia);
    }


    // Listar todas as Denuncias
    public List<Denuncia> listarTodas() {
        return repositoryDenuncia.findAll();
    }

    // Procurar Usuario por ID
    public Denuncia procurarDenunciaPorId(Integer denunciaId) {
        return repositoryDenuncia.findById(denunciaId).orElseThrow();
    }

    // Deletar Denuncia pelo Id
    public void deletarDenuncia(Integer id){
        repositoryDenuncia.deleteById(id);
    }
}
