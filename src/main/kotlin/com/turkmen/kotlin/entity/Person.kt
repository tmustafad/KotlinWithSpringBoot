package com.turkmen.kotlin.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Person(
        var name: String = "",
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0

)