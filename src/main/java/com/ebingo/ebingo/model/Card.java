package com.ebingo.ebingo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Card {
    @Id
    private String cardId;
    private String gameId;

    public Card() {}

    public Card(String cardId, String gameId) {
        this.cardId = cardId;
        this.gameId = gameId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }
}