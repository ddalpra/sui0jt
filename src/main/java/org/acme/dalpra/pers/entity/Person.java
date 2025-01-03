package org.acme.dalpra.pers.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;

import lombok.*;
import org.acme.dalpra.entity.BaseEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PersonForRepository")
public class Person extends BaseEntity {

    private String name;
    private LocalDate birthDate;

}