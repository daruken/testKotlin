package com.example.testkotlin.repository

import com.example.testkotlin.entity.Member
import com.example.testkotlin.entity.Team
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
    //fun findByIdAndTeam(id: String, team: Team): List<Member>

    fun findMemberByIdAndTeam(id: String, team: Team): List<Member>
}