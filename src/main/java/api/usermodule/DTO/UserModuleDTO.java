package api.usermodule.DTO;

import api.usermodule.domains.User;
import api.usermodule.domains.UserModule;

/**
 * @author Michael Arandityo Nugroho
 */
public class UserModuleDTO {
    private UserDTO userDTO;
    private ModuleDTO moduleDTO;
    private Integer moduleOrder;

    public UserModuleDTO() {
    }

    public UserModuleDTO(UserModule userModule) {
        this.userDTO = new UserDTO(userModule.getUser());
        this.moduleDTO = new ModuleDTO(userModule.getModule());
        this.moduleOrder = userModule.getModuleOrder();
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public ModuleDTO getModuleDTO() {
        return moduleDTO;
    }

    public void setModuleDTO(ModuleDTO moduleDTO) {
        this.moduleDTO = moduleDTO;
    }

    public Integer getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }
}
