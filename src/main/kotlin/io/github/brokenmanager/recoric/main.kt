package io.github.brokenmanager.recoric

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RecoricApplication

fun main(args: Array<String>) {
    runApplication<RecoricApplication>(*args)
}