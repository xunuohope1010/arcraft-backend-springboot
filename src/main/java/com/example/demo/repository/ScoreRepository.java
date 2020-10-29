package com.example.demo.repository;

import com.example.demo.models.Pattern;
import com.example.demo.models.Score;
import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {

}
