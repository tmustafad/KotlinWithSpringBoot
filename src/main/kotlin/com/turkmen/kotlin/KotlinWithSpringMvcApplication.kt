package com.turkmen.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class KotlinWithSpringMvcApplication

fun main(args: Array<String>) {
    runApplication<KotlinWithSpringMvcApplication>(*args)
}
