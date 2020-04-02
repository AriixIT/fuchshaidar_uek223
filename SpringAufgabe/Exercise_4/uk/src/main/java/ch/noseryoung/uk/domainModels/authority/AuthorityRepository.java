package ch.noseryoung.uk.domainModels.authority;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// This is an example repository with an example query
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {



}
