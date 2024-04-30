package com.ebingo.ebingo.helpers;

import java.util.List;

import com.ebingo.ebingo.model.Card;

public class CardWithNumbers {
    private String cardId;
    private Card card;
    private List<String> numbers;

    public CardWithNumbers(String cardId, Card card, List<String> numbers) {
        this.cardId = cardId;
        this.card = card;
        this.numbers = numbers;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }
}
