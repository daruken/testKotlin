package com.example.testkotlin.repository

import com.example.testkotlin.entity.Team
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository : JpaRepository<Team, Long> {
}