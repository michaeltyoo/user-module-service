package api.usermodule.DTO;

import api.usermodule.domains.UserModule;

/**
 * @author Michael Arandityo Nugroho
 */
public class UserModuleDTO {
    private UserModulePKDTO userModulePKDTO;
    private ModuleDTO moduleDTO;

    public UserModuleDTO() {
    }

    public UserModuleDTO(UserModule userModule) {
        this.userModulePKDTO = new UserModulePKDTO(userModule.getUserModulePK());
        this.moduleDTO = new ModuleDTO(userModule.getModule().getModuleId(), userModule.getModule().getModuleCode(), userModule.getModule().getModuleName());
    }

    public UserModulePKDTO getUserModulePKDTO() {
        return userModulePKDTO;
    }

    public void setUserModulePKDTO(UserModulePKDTO userModulePKDTO) {
        this.userModulePKDTO = userModulePKDTO;
    }

    public ModuleDTO getModuleDTO() {
        return moduleDTO;
    }

    public void setModuleDTO(ModuleDTO moduleDTO) {
        this.moduleDTO = moduleDTO;
    }

}
