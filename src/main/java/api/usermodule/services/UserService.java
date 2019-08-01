package api.usermodule.services;

import api.usermodule.DTO.PretestResponseDTO;
import api.usermodule.DTO.PretestResponseListDTO;
import api.usermodule.DTO.UserDTO;
import api.usermodule.DTO.UserModuleDTO;
import api.usermodule.domains.User;
import api.usermodule.domains.UserModule;
import api.usermodule.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Michael Arandityo Nugroho
 */

@Service("userService")
@Transactional
public class UserService {

    private Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
    }

    public PretestResponseDTO getModulesByUserId(Long userId) {
        PretestResponseDTO pretestResponseDTO = new PretestResponseDTO();
        User user = userRepository.findByUserId(userId);
        if (user != null && user.getModules().size() > 0) {
            pretestResponseDTO.setModules(user.getModules().stream().map(userModule -> {
                UserModuleDTO userModuleDTO = new UserModuleDTO(userModule);
                return new PretestResponseListDTO(userModuleDTO);
            }).collect(Collectors.toList()));
        }
        return pretestResponseDTO;
    }
}
