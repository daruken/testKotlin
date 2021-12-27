package com.example.testkotlin.entity

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*


@Entity
@Table(name = "team", schema = "mybodydiary", catalog = "mybodydiary")
class Team () {
    @Id
    @Column(name = "clubname")
    var clubname: String? = ""

    @Column(name = "league")
    var league: String? = ""

    @Column(name = "numOfSpec")
    var numOfSpec: Int? = 0

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
    val member: List<Member> = arrayListOf()

    constructor(clubname: String, league: String, numOfSpec: Int) : this() {
        this.clubname = clubname
        this.league = league
        this.numOfSpec = numOfSpec
    }
}