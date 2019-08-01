package api.usermodule.services;

import api.usermodule.DTO.ModuleDTO;
import api.usermodule.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Michael Arandityo Nugroho
 */

@Service("moduleService")
@Transactional
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public List<ModuleDTO> getAllModules() {
        return moduleRepository.findAll().stream().map(ModuleDTO::new).collect(Collectors.toList());
    }
}
