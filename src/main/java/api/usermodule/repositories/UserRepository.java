package api.usermodule.repositories;

import api.usermodule.DTO.UserDTO;
import api.usermodule.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author Michael Arandityo Nugroho
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
