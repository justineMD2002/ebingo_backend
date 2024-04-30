package com.ebingo.ebingo.controller;

import com.ebingo.ebingo.helpers.CardWithNumbers;
import com.ebingo.ebingo.model.*;
import com.ebingo.ebingo.service.BingoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bingo")
public class BingoController {

    @Autowired
    private BingoService bingoService;

    @PostMapping("/createGame")
    public ResponseEntity<Game> createGame() {
        Game game = bingoService.createGame();
        return new ResponseEntity<>(game, HttpStatus.CREATED);
    }

    @GetMapping("/checkGame/{gameId}")
    public int checkGameExists(@PathVariable String gameId) {
        return bingoService.checkGameExists(gameId) ? 1 : 0;
    }

    @PostMapping("/drawNumber/{gameId}")
    public ResponseEntity<DrawnNumber> drawNumber(@PathVariable String gameId) {
        DrawnNumber drawnNumber = bingoService.drawNumber(gameId);
        return new ResponseEntity<>(drawnNumber, HttpStatus.CREATED);
    }

    @PostMapping("/createCard/{gameId}")
    public ResponseEntity<CardWithNumbers> createCard(@PathVariable String gameId) {
        CardWithNumbers cardWithNumbers = bingoService.createCard(gameId);
        return new ResponseEntity<>(cardWithNumbers, HttpStatus.CREATED);
    }    

    @GetMapping("/checkWin/{cardId}")
    public int checkWin(@PathVariable String cardId) {
        return bingoService.checkwin(cardId) ? 1 : 0;
    }
}
