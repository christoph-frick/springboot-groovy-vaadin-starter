package app

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.web.SpringBootServletInitializer

@SpringBootApplication
@CompileStatic
class Application extends SpringBootServletInitializer {

    static void main(String[] args) throws Exception {
        def app = new SpringApplication(Application)
        app.showBanner = false
        app.run(args)
    }

}
