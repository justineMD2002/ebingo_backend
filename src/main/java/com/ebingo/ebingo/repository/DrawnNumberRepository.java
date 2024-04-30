package com.ebingo.ebingo.repository;

import com.ebingo.ebingo.model.DrawnNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrawnNumberRepository extends JpaRepository<DrawnNumber, Long> {
    List<DrawnNumber> findByGameId(String gameId);
}
