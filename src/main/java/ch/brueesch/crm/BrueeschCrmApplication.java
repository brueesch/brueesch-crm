package ch.brueesch.crm;

import ch.brueesch.crm.address.Address;
import ch.brueesch.crm.address.AddressRepository;
import ch.brueesch.crm.company.Company;
import ch.brueesch.crm.company.CompanyRepository;
import ch.brueesch.crm.contact.Contact;
import ch.brueesch.crm.contact.ContactRepository;
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
        return args -> Stream.of("Bank of America", "JPMorgan Chase", "Barclays", "Japan Post Bank", "BNP Paribas", "Mitsubishi UFJ Financial Group", "Deutsche Bank",
                "Crédit Agricole", "HSBC Holdings", "Industrial & Commercial Bank of China", "UBS", "Vontobel", "Credit Suisse", "ZKB", "GKB", "Postfinance")
                .forEach(name -> companyRepository.save(new Company().setName(name)));
    }

    @Bean
    public CommandLineRunner runner2(final AddressRepository addressRepositoryRepository) {
        return args -> Stream.of("Zürich", "Bern", "Chur", "Tschiertschen", "St.Gallen", "Winterthur")
                .forEach(name -> addressRepositoryRepository.save(new Address().setCity(name)));
    }

    @Bean
    public CommandLineRunner runner3(final ContactRepository contactRepository) {
        return args -> Stream.of("Tom Cruise", "Johnny Depp", "Tom Hanks", "Jack Nicholson", "Leonardo DiCaprio", "Robert Downey Jr.", "Clint Eastwood",
                "Will Smith", "Angelina Jolie", "Jennifer Aniston", "Scarlett Johansson", "Natalie Portman", "Charlize Theron", "Jennifer Lawrence", "Jessica Alba", "Megan Fox")
                .forEach(name -> contactRepository.save(new Contact().setFirstName(name)));
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
