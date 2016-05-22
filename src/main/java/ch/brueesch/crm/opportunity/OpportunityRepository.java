package ch.brueesch.crm.opportunity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

@RepositoryRestResource
public interface OpportunityRepository extends JpaRepository<Opportunity, Long> {

    @RestResource( path = "by-description", rel = "by-description")
    Collection<Opportunity> findByDescription(String description);
}
