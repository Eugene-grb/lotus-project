package com.github.eugenegrb.lotus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LotusApplication

fun main(args: Array<String>) {
	runApplication<LotusApplication>(*args)
}
