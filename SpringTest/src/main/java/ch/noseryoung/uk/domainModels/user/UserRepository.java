package ch.noseryoung.uk.domainModels.user;

import ch.noseryoung.uk.domainModels.user.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// This is an example repository with an example query
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // This is an example query, it isn't actually used
    // It exists to show the basic syntax of the generated queries
    public User findByUsernameAndLockedFalse(String username);

    @Query(value = "SELECT * FROM USERS WHERE username like 'a%'", nativeQuery = true)
    List<User> nameWithA();

}
