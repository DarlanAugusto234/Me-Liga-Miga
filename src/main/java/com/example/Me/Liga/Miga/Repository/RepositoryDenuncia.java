package com.example.Me.Liga.Miga.Repository;

import com.example.Me.Liga.Miga.Classes.Denuncia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDenuncia extends JpaRepository<Denuncia, Integer> {



}
