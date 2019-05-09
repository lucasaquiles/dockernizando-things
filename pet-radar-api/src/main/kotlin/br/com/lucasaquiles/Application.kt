package br.com.lucasaquiles

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("br.com.lucasaquiles")
                .mainClass(Application.javaClass)
                .start()
    }
}