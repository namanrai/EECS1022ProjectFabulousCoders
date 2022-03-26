package com.example.finalprojectnewtesting;

public class GameSettings {
    private int range;
    private String tries;
    private int answer;
    private int guess;

    GameSettings(int range, String tries) {
        this.range = range;
        this.tries = tries;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getTries() {
        return tries;
    }

    public void setTries(String tries) {
        this.tries = tries;
    }
    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
