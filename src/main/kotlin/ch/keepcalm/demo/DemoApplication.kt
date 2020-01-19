package ch.keepcalm.demo

import ch.sbb.esta.openshift.gracefullshutdown.GracefulshutdownSpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    GracefulshutdownSpringApplication.run(DemoApplication::class.java, *args)
}


@RestController
class LivenessProbe {
    @GetMapping(value = ["/alive"])
    fun alive() = "ok"
}
