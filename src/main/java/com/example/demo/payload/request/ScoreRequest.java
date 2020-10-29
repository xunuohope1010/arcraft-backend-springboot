package com.example.demo.payload.request;

import javax.validation.constraints.NotBlank;

public class ScoreRequest {
//    @NotBlank
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
