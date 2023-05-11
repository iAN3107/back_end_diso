package com.diso.back_end_diso.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String userName;

    @Column
    private String pass;

    @Column
    private String role;

    @OneToMany(mappedBy = "user")
    private List<Replacement> replacements;
}
