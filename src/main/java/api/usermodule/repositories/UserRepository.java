package api.usermodule.repositories;

import api.usermodule.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Michael Arandityo Nugroho
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(Long userId);
    List<User> findAllByUserCode(String userCode);
    List<User> findAllByUserCodeAndUserIdNot(String userCode, Long userId);
}
