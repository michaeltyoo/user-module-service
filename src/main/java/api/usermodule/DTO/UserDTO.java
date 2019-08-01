package api.usermodule.DTO;

import api.usermodule.domains.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Michael Arandityo Nugroho
 */
public class UserDTO {
    private Long userId;
    private String userCode;
    private String userName;
    private List<ModuleDTO> modules;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.userCode = user.getUserCode();
        this.userName = user.getUserName();
        this.modules = user.getModules().stream().map(userModule -> new ModuleDTO(userModule.getModule())).collect(Collectors.toList());
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<ModuleDTO> getModules() {
        return modules;
    }

    public void setModules(List<ModuleDTO> modules) {
        this.modules = modules;
    }
}
