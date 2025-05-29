package com.example.Me.Liga.Miga.Services;

import com.example.Me.Liga.Miga.Classes.Denuncia;
import com.example.Me.Liga.Miga.Repository.RepositoryDenuncia;
import com.example.Me.Liga.Miga.Status.Status;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceDenuncia {

    RepositoryDenuncia repositoryDenuncia;
    ModelMapper modelmapper;

    public ServiceDenuncia(RepositoryDenuncia repositoryDenuncia, ModelMapper modelmapper) {
        this.repositoryDenuncia = repositoryDenuncia;
        this.modelmapper = modelmapper;
    }

    // Salvar a Denuncia
    public Denuncia salvarDenuncia(Denuncia DTOdenuncia) {
        Denuncia denuncia = modelmapper.map(DTOdenuncia, Denuncia.class);
        denuncia.setDataHora(LocalDateTime.now());
        denuncia.setStatus(Status.ENVIADO);
        return repositoryDenuncia.save(denuncia);
    }

    // Listar todas as Denuncias
    public List<Denuncia> listarTodas() {
        return repositoryDenuncia.findAll();
    }

    // Buscar Denúncia por ID
    public Optional<Denuncia> buscarPorId(Integer id) {
        return repositoryDenuncia.findById(id);
    }

    // Deletar Denuncia pelo Id
    public void deletarDenuncia(Integer id){
        repositoryDenuncia.deleteById(id);
    }
}
