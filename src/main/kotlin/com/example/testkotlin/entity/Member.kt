package com.example.testkotlin.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Table(name = "member", schema="mybodydiary", catalog = "mybodydiary")
class Member {
    @Id
    @Column(name = "id")
    var id: String = ""

    @Column(name = "name")
    var name: String = ""

    @Column(name = "createdAt")
    var createdAt: LocalDateTime = LocalDateTime.now()

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team")
    var team: Team? = null
}

