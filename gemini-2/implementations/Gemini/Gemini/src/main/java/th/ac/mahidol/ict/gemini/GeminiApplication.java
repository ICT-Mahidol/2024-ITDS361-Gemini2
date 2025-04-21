package th.ac.mahidol.ict.gemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("th.ac.mahidol.ict.gemini.repository")
@EntityScan({"th.ac.mahidol.ict.gemini.model", "edu.gemini.app.ocs.model"})  // รวมทั้งสอง package
@ComponentScan("th.ac.mahidol.ict.gemini")
public class GeminiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeminiApplication.class, args);
        System.out.println("Working directory: " + new java.io.File(".").getAbsolutePath());
    }

}
