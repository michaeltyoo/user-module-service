package api.usermodule.DTO;

/**
 * @author Michael Arandityo Nugroho
 */
public class PretestResponseListDTO {
    private String moduleName;
    private Integer moduleOrder;

    public PretestResponseListDTO() {
    }

    public PretestResponseListDTO(UserModuleDTO userModuleDTO) {
        this.moduleName = userModuleDTO.getModuleDTO().getModuleName();
        this.moduleOrder = userModuleDTO.getModuleOrder();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }
}
