package api.usermodule.repositories;

import api.usermodule.domains.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author Michael Arandityo Nugroho
 */
@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
//    public List<Module> findAllByUser(Long userId);
}
