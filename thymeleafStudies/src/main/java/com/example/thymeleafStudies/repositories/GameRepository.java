package com.example.thymeleafStudies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.thymeleafStudies.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
