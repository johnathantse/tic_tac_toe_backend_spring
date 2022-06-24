package com.tic_tac_web_server.server.rest_service;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tic_tac_web_server.models.GameState;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

@Service
public class GameService {
    private File saveFile;

    ObjectMapper mapper = new ObjectMapper();

    GameService() throws IOException {
        saveFile = ResourceUtils.getFile("classpath:saved_game.json");
    }

    public void saveGame(GameState gameState) {
        try {
            mapper.writeValue(this.saveFile, gameState);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public GameState loadGame() {
        GameState gameState = null;
        try {
            gameState = mapper.readValue(this.saveFile, GameState.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gameState;
    }

}
