package com.ebingo.ebingo.repository;

import com.ebingo.ebingo.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, String> {
}
