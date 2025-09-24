package br.com.edgeone.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RhApiApplication

fun main(args: Array<String>) {
	runApplication<RhApiApplication>(*args)
}
