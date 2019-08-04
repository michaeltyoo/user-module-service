package api.usermodule.services;

import api.usermodule.DTO.PretestResponseDTO;
import api.usermodule.DTO.PretestResponseListDTO;
import api.usermodule.DTO.UserModuleDTO;
import api.usermodule.domains.UserModule;
import api.usermodule.repositories.UserModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Michael Arandityo Nugroho
 */
@Service("userModuleService")
@Transactional
public class UserModuleService {

    @Autowired
    private UserModuleRepository userModuleRepository;

    public List<UserModuleDTO> getAllUserModules() {
        return userModuleRepository.findAll().stream().map(UserModuleDTO::new).collect(Collectors.toList());
    }

    public PretestResponseDTO getUserModulesByUserId(Long userId) {
        PretestResponseDTO pretestResponseDTO = new PretestResponseDTO();
        List<UserModule> userModules = userModuleRepository.findAllByUserModulePK_User_UserIdOrderByUserModulePK_ModuleOrder(userId);
        if (userModules.size() > 0) {
            pretestResponseDTO.setModules(userModules.stream().map(userModule -> {
                UserModuleDTO userModuleDTO = new UserModuleDTO(userModule);
                return new PretestResponseListDTO(userModuleDTO);
            }).collect(Collectors.toList()));
        }
        return pretestResponseDTO;
    }
}
