package org.acme.dalpra.user.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.acme.dalpra.entity.BaseEntity;
import org.acme.dalpra.user.util.Active;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Users")
public class User extends BaseEntity {
    private String username;
    private String password;
    private Active active;

}
