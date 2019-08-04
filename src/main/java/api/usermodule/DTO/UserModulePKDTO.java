package api.usermodule.DTO;

import api.usermodule.domains.UserModulePK;

/**
 * @author Michael Arandityo Nugroho
 */
public class UserModulePKDTO {
    private UserDTO userDTO;
    private Integer moduleOrder;

    public UserModulePKDTO() {
    }

    public UserModulePKDTO(UserModulePK userModulePK) {
        this.userDTO = new UserDTO(userModulePK.getUser().getUserId(), userModulePK.getUser().getUserCode(), userModulePK.getUser().getUserName());
        this.moduleOrder = userModulePK.getModuleOrder();
    }

    public Integer getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
