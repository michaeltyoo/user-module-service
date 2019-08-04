package api.usermodule.repositories;

import api.usermodule.domains.UserModule;
import api.usermodule.domains.UserModulePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Michael Arandityo Nugroho
 */
@Repository
public interface UserModuleRepository extends JpaRepository<UserModule, Long> {
    List<UserModule> findAllByUserModulePK_User_UserIdOrderByUserModulePK_ModuleOrder(Long userId);
    List<UserModule> findAllByUserModulePK(UserModulePK userModulePK);
    UserModule findFirstByUserModulePK_User_UserIdOrderByUserModulePK_ModuleOrderDesc(Long userId);
}
