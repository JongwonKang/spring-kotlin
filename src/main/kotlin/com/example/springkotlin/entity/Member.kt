package com.example.springkotlin.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_member")
class Member {
    @Id
    @GeneratedValue
    var id: Long? = null
    var name: String? = null
}