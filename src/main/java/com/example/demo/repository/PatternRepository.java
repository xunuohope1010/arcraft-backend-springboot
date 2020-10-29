package com.example.demo.repository;

import com.example.demo.models.Pattern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PatternRepository extends JpaRepository<Pattern, Long> {
    List<Pattern> findByName(String name);

//    @Query("SELECT t FROM Pattern t WHERE t.fooIn = ?1 AND t.bar = ?2")
//    Pattern findByFooInAndBar(String fooIn, String bar);
}
