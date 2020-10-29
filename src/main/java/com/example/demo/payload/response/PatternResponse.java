package com.example.demo.payload.response;

import com.example.demo.models.Pattern;

import java.util.List;

public class PatternResponse {

    private List<Pattern>patterns;

    public List<Pattern> getPatterns() {
        return patterns;
    }

    public void setPatterns(List<Pattern> patterns) {
        this.patterns = patterns;
    }

    public PatternResponse(List<Pattern> patterns) {
        this.patterns = patterns;
    }


}
