package hello.gyeongsoo.demooauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DemoOAuth2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoOAuth2Application.class, args);
    }

}
