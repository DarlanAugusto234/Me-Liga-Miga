package com.example.Me.Liga.Miga.Controller;

import com.example.Me.Liga.Miga.Classes.Denuncia;
import com.example.Me.Liga.Miga.DTO.DTODenuncia;
import com.example.Me.Liga.Miga.Services.ServiceDenuncia;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerDenuncia {

    private final ServiceDenuncia serviceDenuncia;

    public ControllerDenuncia(ServiceDenuncia serviceDenuncia) {
        this.serviceDenuncia = serviceDenuncia;
    }

    // Criar uma nova denúncia
    @PostMapping("/fazerDenuncia")
    public Denuncia criarDenuncia(@RequestBody DTODenuncia dtoDenuncia) {
        return serviceDenuncia.salvarDenuncia(dtoDenuncia);
    }

    // Buscar denúncia por ID
    @GetMapping("/buscarDenuncia/{id}")
    public Denuncia buscarPorId(@PathVariable Integer id) {
        return serviceDenuncia.procurarDenunciaPorId(id);
    }

    // Listar todas as denúncias
    @GetMapping("/listarDenuncias")
    public List<Denuncia> listarTodas() {
        return serviceDenuncia.listarTodas();
    }

    // Deletar denúncia por ID
    @DeleteMapping("/deletarDenuncia/{id}")
    public void deletarDenuncia(@PathVariable Integer id) {
        serviceDenuncia.deletarDenuncia(id);
    }
}
