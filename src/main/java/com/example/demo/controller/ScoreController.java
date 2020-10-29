package com.example.demo.controller;

import com.example.demo.models.Score;
import com.example.demo.payload.request.ScoreRequest;
import com.example.demo.payload.response.ScoreResponse;
import com.example.demo.repository.ScoreRepository;
import com.example.demo.security.jwt.AuthTokenFilter;
import com.example.demo.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ScoreController {
    @Autowired
    ScoreRepository scoreRepository;

    @Autowired
    AuthTokenFilter authTokenFilter;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/update")
    public ResponseEntity<?> update(@Valid @RequestBody ScoreRequest scoreRequest, HttpServletRequest httpRequest) {
        String jwt = authTokenFilter.parseJwt(httpRequest);
        String username = jwtUtils.getUserNameFromJwtToken(jwt);
        System.out.println(username);

        Score score = new Score(username, scoreRequest.getScore());
        scoreRepository.save(score);

        List<Score> scores = scoreRepository.findAll();
        for(Score one: scores){
            System.out.println(one.getScore());
        }

        return ResponseEntity.ok(new ScoreResponse(scores));
    }
}
