package ch.brueesch.crm;

import ch.brueesch.crm.client.company.Company;
import ch.brueesch.crm.client.company.CompanyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class BrueeschCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrueeschCrmApplication.class, args);
    }


    @Bean
    public CommandLineRunner runner(final CompanyRepository companyRepository) {
        return args -> Stream.of("Confinale", "UBS", "Vontobel", "Credit Suisse", "ZKB", "GKB")
                .forEach(name -> companyRepository.save(new Company(name)));
    }

    @Bean
    public HealthIndicator customHealthIndicator() {
        return new HealthIndicator() {
            @Override
            public Health health() {
                return Health.status("I <3 Java!").build();
            }
        };
    }
}
