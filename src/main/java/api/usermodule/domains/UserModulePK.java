package api.usermodule.domains;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Michael Arandityo Nugroho
 */
@Embeddable
public class UserModulePK implements Serializable {

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "MODULE_ORDER")
    private Integer moduleOrder;

    public Integer getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
