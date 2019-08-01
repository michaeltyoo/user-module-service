package api.usermodule.DTO;

import api.usermodule.domains.Module;

/**
 * @author Michael Arandityo Nugroho
 */
public class ModuleDTO {
    private Long moduleId;
    private String moduleCode;
    private String moduleName;

    public ModuleDTO() {
    }

    public ModuleDTO(Module module) {
        this.moduleId = module.getModuleId();
        this.moduleCode = module.getModuleCode();
        this.moduleName = module.getModuleName();
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
