package api.usermodule.domains;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Michael Arandityo Nugroho
 */
@Entity
public class UserModule implements Serializable {

    @EmbeddedId
    private UserModulePK userModulePK;
    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "module_id")
    private Module module;

    public UserModule() {
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public UserModulePK getUserModulePK() {
        return userModulePK;
    }

    public void setUserModulePK(UserModulePK userModulePK) {
        this.userModulePK = userModulePK;
    }
}
