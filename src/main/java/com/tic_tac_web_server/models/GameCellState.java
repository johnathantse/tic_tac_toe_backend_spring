package com.tic_tac_web_server.models;

import java.io.Serializable;
import java.util.Objects;

public class GameCellState implements Serializable {
    private String option;
    private Boolean cellHasPlayed;
    private Integer id;

    public GameCellState() {
    }

    public GameCellState(String option, Boolean cellHasPlayed, Integer id) {
        this.option = option;
        this.cellHasPlayed = cellHasPlayed;
        this.id = id;
    }

    public String getOption() {
        return this.option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Boolean isCellHasPlayed() {
        return this.cellHasPlayed;
    }

    public Boolean getCellHasPlayed() {
        return this.cellHasPlayed;
    }

    public void setCellHasPlayed(Boolean cellHasPlayed) {
        this.cellHasPlayed = cellHasPlayed;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GameCellState option(String option) {
        setOption(option);
        return this;
    }

    public GameCellState cellHasPlayed(Boolean cellHasPlayed) {
        setCellHasPlayed(cellHasPlayed);
        return this;
    }

    public GameCellState id(Integer id) {
        setId(id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GameCellState)) {
            return false;
        }
        GameCellState gameCellState = (GameCellState) o;
        return Objects.equals(option, gameCellState.option)
                && Objects.equals(cellHasPlayed, gameCellState.cellHasPlayed) && Objects.equals(id, gameCellState.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(option, cellHasPlayed, id);
    }

    @Override
    public String toString() {
        return "{" +
                " option='" + getOption() + "'" +
                ", cellHasPlayed='" + isCellHasPlayed() + "'" +
                ", id='" + getId() + "'" +
                "}";
    }

}
