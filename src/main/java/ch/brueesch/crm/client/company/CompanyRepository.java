package ch.brueesch.crm.client.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<Company, Long> {

    @RestResource( path = "by-name", rel = "by-name")
    Collection<Company> findByCompanyName(String companyName);
}
