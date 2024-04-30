package com.ebingo.ebingo.repository;

import com.ebingo.ebingo.model.CardNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardNumberRepository extends JpaRepository<CardNumber, Long> {
    List<CardNumber> findByCardId(String cardId);
}
