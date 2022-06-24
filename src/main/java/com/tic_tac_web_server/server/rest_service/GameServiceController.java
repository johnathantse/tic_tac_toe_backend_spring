package com.tic_tac_web_server.server.rest_service;

import com.tic_tac_web_server.models.GameState;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class GameServiceController {

    @Autowired
    GameService gameService;

    @PutMapping("/gameboard")
    public void saveGame(@RequestBody GameState gameState) {
        gameService.saveGame(gameState);
    }

    @GetMapping("/gameboard")
    public GameState loadGame() {
        GameState gameState = gameService.loadGame();
        return gameState;
    }

}
