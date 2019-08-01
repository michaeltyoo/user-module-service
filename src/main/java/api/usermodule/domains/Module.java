package api.usermodule.domains;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Michael Arandityo Nugroho
 */
@Entity
public class Module implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "module_id")
    private Long moduleId;
    @Column(name = "module_code")
    private String moduleCode;
    @Column(name = "module_name")
    private String moduleName;

    @OneToMany(mappedBy = "module",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<UserModule> users = new HashSet<>();

    public Module() {
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

    public Set<UserModule> getUsers() {
        return users;
    }

    public void setUsers(Set<UserModule> users) {
        this.users = users;
    }
}
