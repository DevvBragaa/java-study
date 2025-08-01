package com.imc.body_calculator.domain;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@SequenceGenerator(name = "seq_address", initialValue = 1, allocationSize = 1)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(generator = "seq_address",strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "cep")
    private String cep;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "bairro")
    private String neighborhood;

    @OneToOne(mappedBy = "address")
    @JsonBackReference
    private User user;
}
