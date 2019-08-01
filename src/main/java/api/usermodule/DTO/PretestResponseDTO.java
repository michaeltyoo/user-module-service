package api.usermodule.DTO;

import java.util.List;

/**
 * @author Michael Arandityo Nugroho
 */
public class PretestResponseDTO {
    List<PretestResponseListDTO> modules;

    public PretestResponseDTO() {
    }

    public List<PretestResponseListDTO> getModules() {
        return modules;
    }

    public void setModules(List<PretestResponseListDTO> modules) {
        this.modules = modules;
    }
}
