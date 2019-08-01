package api.usermodule.domains;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author Michael Arandityo Nugroho
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userCode;
    private String userName;

    @OneToMany(mappedBy = "module",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<UserModule> modules;

    public User() {
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

    public Set<UserModule> getModules() {
        return modules;
    }

    public void setModules(Set<UserModule> modules) {
        this.modules = modules;
    }
}
