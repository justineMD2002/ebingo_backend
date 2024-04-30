package com.ebingo.ebingo.repository;

import com.ebingo.ebingo.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, String> {
}
