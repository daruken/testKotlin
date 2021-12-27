package com.example.testkotlin.controller

import com.example.testkotlin.entity.Team
import com.example.testkotlin.repository.MemberRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class MemberController (
    val memberRepository: MemberRepository
        ) {

    @GetMapping("/members")
    fun getAllUsers(): ResponseEntity<*> {
        val users = memberRepository.findAll()

        return ResponseEntity.ok(users)
    }

    @GetMapping("/member")
    fun getUsers(@RequestParam("id") id: String,
                 @RequestParam("team") team: String): ResponseEntity<*> {

        val localTeam = Team(team, "", 0)

        val users = memberRepository.findMemberByIdAndTeam(id, localTeam)

        return ResponseEntity.ok(users)
    }
}