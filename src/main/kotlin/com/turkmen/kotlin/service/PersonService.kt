package com.turkmen.kotlin.service

import com.turkmen.kotlin.entity.Person
import com.turkmen.kotlin.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(val personRepository: PersonRepository) {


    fun findAll(): List<Person> {
        return personRepository.findAll();
    }


    fun save(person: Person) {
        personRepository.save(person)
    }
}