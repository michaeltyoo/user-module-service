package api.usermodule.resources;

import api.usermodule.DTO.PretestResponseDTO;
import api.usermodule.DTO.UserDTO;
import api.usermodule.DTO.UserSaveDTO;
import api.usermodule.domains.User;
import api.usermodule.services.UserModuleService;
import api.usermodule.services.UserService;
import api.usermodule.util.UserModuleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Michael Arandityo Nugroho
 */

@RestController
@RequestMapping("/api/user")
public class UserResource {

    private static final Logger log = LoggerFactory.getLogger(UserResource.class);

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<UserDTO> findAllUser() {
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/findAllModuleByUserId/{userId}")
    public PretestResponseDTO findAllModuleByUserId(@PathVariable("userId") Long userId) {
        return userService.getModulesByUserId(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/findUserById/{userId}")
    public UserDTO findByUserId(@PathVariable("userId") Long userId) {
        try {
            return new UserDTO(userService.findOne(userId));
        } catch (Exception ex) {
            throw new UserModuleException("User Not Found!");
        }
    }

    @PostMapping(name = "/save")
    public UserSaveDTO insertUser(@RequestBody UserSaveDTO userDTO) {
        return new UserSaveDTO(userService.insertUser(userDTO));
    }

    @PutMapping(name = "/update")
    public UserSaveDTO updateUser(@RequestBody UserSaveDTO userDTO) {
        return new UserSaveDTO(userService.updateUser(userDTO));
    }
}
