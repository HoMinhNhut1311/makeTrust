package com.example.makeTrust.repository;

import com.example.makeTrust.enity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<Game, Integer> {

    Optional<Game> findByGameCode(String gameCode);

}
