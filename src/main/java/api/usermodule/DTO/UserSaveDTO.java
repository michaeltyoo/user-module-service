package api.usermodule.DTO;

import api.usermodule.domains.User;

/**
 * @author Michael Arandityo Nugroho
 */
public class UserSaveDTO {
    private Long userId;
    private String userCode;
    private String userName;

    public UserSaveDTO() {
    }

    public UserSaveDTO(User user) {
        this.userId = user.getUserId();
        this.userCode = user.getUserCode();
        this.userName = user.getUserName();
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
}
