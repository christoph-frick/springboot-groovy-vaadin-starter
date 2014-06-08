package app

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.context.web.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
@CompileStatic
class Application extends SpringBootServletInitializer {

    static void main(String[] args) throws Exception {
        def app = new SpringApplication(Application)
        app.showBanner = false
        app.run(args)
    }

}
