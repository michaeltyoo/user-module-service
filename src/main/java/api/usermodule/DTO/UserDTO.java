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
    private List<UserModuleDTO> modules;

    public UserDTO() {
    }

    public UserDTO(Long userId, String userCode, String userName) {
        this.userId = userId;
        this.userCode = userCode;
        this.userName = userName;
    }

    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.userCode = user.getUserCode();
        this.userName = user.getUserName();
        this.modules = user.getModules().stream().map(UserModuleDTO::new).collect(Collectors.toList());
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


    public List<UserModuleDTO> getModules() {
        return modules;
    }

    public void setModules(List<UserModuleDTO> modules) {
        this.modules = modules;
    }
}
