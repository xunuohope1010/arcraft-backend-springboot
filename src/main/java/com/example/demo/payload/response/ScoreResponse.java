package com.example.demo.payload.response;

import com.example.demo.models.Score;

import java.util.List;

public class ScoreResponse {

    private List<Score>scores;
    public ScoreResponse(List<Score> scores) {
        this.scores = scores;
    }

    public List<Score> getScores() {
        return scores;
    }

        public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    
    
}
