package com.example.Me.Liga.Miga.Repository;

import com.example.Me.Liga.Miga.Classes.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, Integer> {



}
