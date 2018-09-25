package project.domain;

import javax.persistence.*;

@Entity
@Table(name = "rel_user_typeservice")
public class RelUserTypeService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_TYPE_SERVICE", nullable = false)
    private Long typeServiceId;

    @Column(name = "ID_USER")
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeServiceId() {
        return typeServiceId;
    }

    public void setTypeServiceId(Long typeServiceId) {
        this.typeServiceId = typeServiceId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
