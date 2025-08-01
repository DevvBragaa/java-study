package com.imc.body_calculator.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.imc.body_calculator.enums.EnumRole;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "roles")
@SequenceGenerator(name = "seq_roles", initialValue = 1, allocationSize = 1)
@Getter
public class Roles {

    @Id
    @GeneratedValue(generator = "seq_roles", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    @Column(name = "role")
    private EnumRole role;
}
