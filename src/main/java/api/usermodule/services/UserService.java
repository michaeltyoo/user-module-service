package api.usermodule.services;

import api.usermodule.DTO.*;
import api.usermodule.domains.Module;
import api.usermodule.domains.User;
import api.usermodule.domains.UserModule;
import api.usermodule.domains.UserModulePK;
import api.usermodule.repositories.UserModuleRepository;
import api.usermodule.repositories.UserRepository;
import api.usermodule.util.UserModuleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
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

    private void convertFromDTO(User user, UserSaveDTO userDTO){
        user.setUserCode(userDTO.getUserCode());
        user.setUserName(userDTO.getUserName());
    }

    public User findOne(Long userId) { return userRepository.findOne(userId); }

    public User insertUser(UserSaveDTO userDTO) {
        User user = new User();
        if(userRepository.findAllByUserCode(userDTO.getUserCode()).size() > 0){
            throw new UserModuleException("User module already exist");
        }
        convertFromDTO(user, userDTO);
        return userRepository.save(user);
    }

    public User updateUser(UserSaveDTO userDTO) {
        User user = findOne(userDTO.getUserId());
        if(userRepository.findAllByUserCodeAndUserIdNot(userDTO.getUserCode(), userDTO.getUserId()).size() > 0){
            throw new UserModuleException("User module already exist");
        }
        convertFromDTO(user, userDTO);
        return userRepository.save(user);
    }

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
