package com.codeverse.grievance_system.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String branch;

    private String designation;

    private String duty;

    private String email;

    private String phone;

    private String assignedCategory;

    private String username;

    private String password;

}