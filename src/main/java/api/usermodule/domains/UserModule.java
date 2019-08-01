package api.usermodule.domains;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Michael Arandityo Nugroho
 */
@Entity
public class UserModule implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;
    @Id
    @ManyToOne
    @JoinColumn(name = "module_id", insertable = false, updatable = false)
    private Module module;

    private Integer moduleOrder;

    public UserModule() {
    }

    public UserModule(User user, Module module) {
        this.user = user;
        this.module = module;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModule that = (UserModule) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(module, that.module) &&
                Objects.equals(moduleOrder, that.moduleOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, module, moduleOrder);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Integer getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }
}
