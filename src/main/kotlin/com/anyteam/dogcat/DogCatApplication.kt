package com.anyteam.dogcat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DogCatApplication

fun main(args: Array<String>) {
    runApplication<DogCatApplication>(*args)
}
