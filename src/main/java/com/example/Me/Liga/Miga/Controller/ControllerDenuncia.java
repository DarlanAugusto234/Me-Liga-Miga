package com.example.Me.Liga.Miga.Controller;

import com.example.Me.Liga.Miga.Classes.Denuncia;
import com.example.Me.Liga.Miga.Services.ServiceDenuncia;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Denuncia> fazerDenuncia(@RequestBody Denuncia denuncia) {
        Denuncia salva = serviceDenuncia.salvarDenuncia(denuncia);
        return ResponseEntity.ok(salva);
    }

    // Buscar denúncia por ID
    @GetMapping("/buscarDenuncia/{id}")
    public ResponseEntity<Denuncia> buscarPorId(@PathVariable Integer id) {
        return serviceDenuncia.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Listar todas as denúncias
    @GetMapping("/listarDenuncias")
    public ResponseEntity<List<Denuncia>> listarTodas() {
        List<Denuncia> denuncias = serviceDenuncia.listarTodas();
        return ResponseEntity.ok(denuncias);
    }

    // Deletar Cliente ou Excluir Conta
    @DeleteMapping("/deletarDenuncia/{id}")
    public void deletarCliente(@PathVariable Integer id) {
        serviceDenuncia.deletarDenuncia(id);
    }
}
