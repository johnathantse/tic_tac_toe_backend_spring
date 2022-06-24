package com.tic_tac_web_server.models;

import java.io.Serializable;
import java.util.ArrayList;

public class GameState implements Serializable {
    private ArrayList<GameCellState> cells;
    private GameCellState lastPlayed;
    private Integer turnsPlayed;
    private ArrayList<GameCellState> turns;
    private Boolean hasPlayed;
    private String winner;
    private Boolean tieGame;

    public GameState() {
    }

    public GameState(ArrayList<GameCellState> cells, GameCellState lastPlayed, Integer turnsPlayed,
            ArrayList<GameCellState> turns, Boolean hasPlayed, String winner, Boolean tieGame) {
        this.cells = cells;
        this.lastPlayed = lastPlayed;
        this.turnsPlayed = turnsPlayed;
        this.turns = turns;
        this.hasPlayed = hasPlayed;
        this.winner = winner;
        this.tieGame = tieGame;
    }

    public Boolean isTieGame() {
        return this.tieGame;
    }

    public Boolean getTieGame() {
        return this.tieGame;
    }

    public void setTieGame(Boolean tieGame) {
        this.tieGame = tieGame;
    }

    public Boolean isHasPlayed() {
        return this.hasPlayed;
    }

    public Boolean getHasPlayed() {
        return this.hasPlayed;
    }

    public void setHasPlayed(Boolean hasPlayed) {
        this.hasPlayed = hasPlayed;
    }

    public String getWinner() {
        return this.winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public ArrayList<GameCellState> getTurns() {
        return this.turns;
    }

    public void setTurns(ArrayList<GameCellState> turns) {
        this.turns = turns;
    }

    public ArrayList<GameCellState> getCells() {
        return this.cells;
    }

    public void setCells(ArrayList<GameCellState> cells) {
        this.cells = cells;
    }

    public GameCellState getLastPlayed() {
        return this.lastPlayed;
    }

    public void setLastPlayed(GameCellState lastPlayed) {
        this.lastPlayed = lastPlayed;
    }

    public Integer getTurnsPlayed() {
        return this.turnsPlayed;
    }

    public void setTurnsPlayed(Integer turnsPlayed) {
        this.turnsPlayed = turnsPlayed;
    }
}