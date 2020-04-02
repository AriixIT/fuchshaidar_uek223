package ch.noseryoung.uk.domainModels.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This is an example repository with an example query
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {


}
