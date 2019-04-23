package com.LPLPrediction.beans;

public class Match {
    private String game_num;
    private String winner;
    private String time;

    public Match() {
    }

    public Match(String game_num, String winner, String time) {
        this.game_num = game_num;
        this.winner = winner;
        this.time = time;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getGame_num() {
        return game_num;
    }

    public void setGame_num(String game_num) {
        this.game_num = game_num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
