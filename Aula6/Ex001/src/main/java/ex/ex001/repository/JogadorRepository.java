package ex.ex001.repository;


import ex.ex001.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JogadorRepository extends JpaRepository<Jogador, UUID> {}
