package com.example.testkotlin.controller

import com.example.testkotlin.repository.TeamRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TeamController (
    val teamRepository: TeamRepository
        ) {

    @GetMapping("/teams")
    fun getAllTeams(): ResponseEntity<*> {
        val teams = teamRepository.findAll()

        return ResponseEntity.ok(teams)
    }
}