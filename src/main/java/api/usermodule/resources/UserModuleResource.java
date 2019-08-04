package api.usermodule.resources;

import api.usermodule.DTO.PretestResponseDTO;
import api.usermodule.DTO.UserDTO;
import api.usermodule.DTO.UserModuleDTO;
import api.usermodule.services.UserModuleService;
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
@RequestMapping("/api/user_module")
public class UserModuleResource {

    private static final Logger log = LoggerFactory.getLogger(UserModuleResource.class);

    @Autowired
    private UserModuleService userModuleService;

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<UserModuleDTO> findAllUserModule() {
        return userModuleService.getAllUserModules();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/findAllModuleByUserId/{userId}")
    public PretestResponseDTO findAllModuleByUser(@PathVariable("userId") Long userId) {
        return userModuleService.getUserModulesByUserId(userId);
    }
}
