package api.usermodule.resources;

import api.usermodule.DTO.PretestResponseDTO;
import api.usermodule.DTO.UserDTO;
import api.usermodule.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Michael Arandityo Nugroho
 */

@RestController
@RequestMapping("/api/user")
public class UserResource {

    private Logger log = LoggerFactory.getLogger(UserResource.class);

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
}
