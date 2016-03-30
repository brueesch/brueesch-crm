package ch.brueesch.crm.address;

import ch.brueesch.crm.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

@RepositoryRestResource
public interface AddressRepository extends JpaRepository<Address, Long> {

}
