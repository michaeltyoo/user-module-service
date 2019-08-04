package api.usermodule.resources;

import api.usermodule.DTO.ModuleDTO;
import api.usermodule.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Michael Arandityo Nugroho
 */

@RestController
@RequestMapping("/api/module")
public class ModuleResource {

    @Autowired
    private ModuleService moduleService;

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<ModuleDTO> findAllModule() {
        return moduleService.getAllModules();
    }
}
