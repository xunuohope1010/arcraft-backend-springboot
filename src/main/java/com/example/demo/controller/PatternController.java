package com.example.demo.controller;

import com.example.demo.models.Pattern;
import com.example.demo.payload.response.PatternResponse;
import com.example.demo.repository.PatternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class PatternController {

    @Autowired
    PatternRepository patternRepository;

    @GetMapping("/pattern")
    public ResponseEntity<?> pattern(@RequestParam("name") String name){
        List<Pattern>patterns = patternRepository.findByName(name);
        return ResponseEntity.ok(new PatternResponse(patterns));
    }
}
