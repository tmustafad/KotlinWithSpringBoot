package com.turkmen.kotlin.controller

import com.turkmen.kotlin.entity.Person
import com.turkmen.kotlin.service.PersonService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/people")
class PersonController(val personService: PersonService) {


    @GetMapping("/all")
    fun getPeople(): List<Person> {
        return personService.findAll()
    }


    @PostMapping("/create/{name}")
    fun createPerson(@PathVariable name: String): List<Person> {
        var person = Person(name)
        personService.save(person)
        return personService.findAll();
    }
}