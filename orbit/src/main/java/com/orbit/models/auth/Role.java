package com.orbit.models.auth;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.orbit.enums.RoleDeserializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "roles_trans")
@JsonDeserialize(using = RoleDeserializer.class)
public class Role {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private EnumRole name;

    public Role() {
    }

    public Role(Integer id, EnumRole name) {
        this.id = id;
        this.name = name;
    }

    public Role(EnumRole name) {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EnumRole getName() {
        return name;
    }

    public void setName(EnumRole name) {
        this.name = name;
    }
}
