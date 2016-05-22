package ch.brueesch.crm.contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

@RepositoryRestResource
public interface ContactRepository extends JpaRepository<Contact, Long> {

    @RestResource( path = "by-first-name", rel = "by-first-name")
    Collection<Contact> findByFirstName(String firstName);
}
