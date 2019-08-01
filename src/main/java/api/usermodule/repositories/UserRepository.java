package api.usermodule.repositories;

import api.usermodule.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Michael Arandityo Nugroho
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
