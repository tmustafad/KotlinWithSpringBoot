package com.turkmen.kotlin.repository

import com.turkmen.kotlin.entity.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository



@Repository
interface PersonRepository : JpaRepository<Person, Long> {
}